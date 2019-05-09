package test;

import cn.qy.service.AccountService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public  void run1(){
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        //获取对象
        AccountService as =  (AccountService)ac.getBean("accountService");
        //调用方法
        as.findAll();
    }

}
