package cn.qy.service.imp;

import cn.qy.dao.AccountDao;
import cn.qy.domain.Account;
import cn.qy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.print("业务层：查询所有账户///");

        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.print("业务层：保存账户///");

    }
}
