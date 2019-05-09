package cn.qy.service;

import cn.qy.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public  void saveAccount(Account account);

}
