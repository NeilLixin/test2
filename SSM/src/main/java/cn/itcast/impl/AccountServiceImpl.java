package cn.itcast.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> finAllaccount() {
        System.out.println("业务层:查询所有账户");

        return accountDao.finAllaccount();
    }




    public void saveAccount(Account account) {
        System.out.println("业务层,更新账户");
        accountDao.saveAccount(account);
    }
}
