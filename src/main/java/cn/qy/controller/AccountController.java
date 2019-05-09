package cn.qy.controller;

import cn.qy.domain.Account;
import cn.qy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public  String findAll(){
        System.out.println("表现层，查询所有账户");
       List<Account> result =  accountService.findAll();
        for (Account ac:result){
            System.out.println(ac);
        }
     return "list";
 }
    @RequestMapping("/save")
    public  String save(Account account){
        account.setId(100);
        System.out.println("表现层，保存账户");
        accountService.saveAccount(account);
        List<Account> result =  accountService.findAll();
        for (Account ac:result){
            System.out.println(ac);
        }
        return "list";
    }

}
