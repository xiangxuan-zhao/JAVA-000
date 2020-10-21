package org.zxx.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
           // Object hello = new HelloClassLoad().findClass("Hello").newInstance();
            Class<?> clazz = new HelloClassLoad().findClass("Hello");
            Object instance = clazz.getDeclaredConstructor().newInstance();
            Method hello = clazz.getMethod("hello");
            hello.invoke(instance);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = new byte[0];
        try {
            bytes = getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defineClass(name, bytes, 0, bytes.length);
    }

    public byte[] getBytes() throws IOException {

        File file = new File("Hello.xlass");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        int n = fis.read(bytes, 0, (int) file.length());
        for(int i = 0;i < n;i++){
           bytes[i] = (byte)(255 - bytes[i]);
         }
        return bytes;
    }
}
