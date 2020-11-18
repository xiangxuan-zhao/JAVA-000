package org.load.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.load.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO
 *
 * @author Administrator
 * @date 2020/11/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class TestLoad {
    @Autowired
    private IAccountService accountService;

    @Test
    public void transfer(){
        accountService.transfer();
    }
}
