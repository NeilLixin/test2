import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class TestAccount {

    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        AccountService accountService = context.getBean("accountServiceImpl", AccountService.class);

//        AccountService accountService1 = context.getBean(AccountService.class);

        accountService.finAllaccount();


    }








}
