package org.zxx.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLClassLoader;

/**
 * TODO
 *
 * @author Administrator
 * @date 2020/10/21
 */
public class HelloClassLoad extends ClassLoader {

    public static void main(String[] args) {
        try {
            new HelloClassLoad().findClass("Hello.xlass").newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = new byte[0];
        try {
            bytes = getBytes(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defineClass(name, bytes, 0, bytes.length);
    }

    public byte[] getBytes(String name) throws IOException {

        File file = new File(name);
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        for(int i = 0;i < fis.read(bytes, 0, (int) file.length());i++){
            bytes[i] = (byte)(255 - bytes[i]);
        }
        return bytes;
    }
}
