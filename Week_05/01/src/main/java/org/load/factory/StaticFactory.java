package org.load.factory;

import org.load.service.IAccountService;
import org.load.service.impl.AccountServiceImpl;

/**
 * TODO
 *
 * @author Administrator
 * @date 2020/11/18
 */
public class StaticFactory {
    public static  IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
