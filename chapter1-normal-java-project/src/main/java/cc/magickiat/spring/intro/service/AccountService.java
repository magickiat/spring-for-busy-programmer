package cc.magickiat.spring.intro.service;

import cc.magickiat.spring.intro.dao.AccountDao;
import cc.magickiat.spring.intro.dto.AccountDto;
import cc.magickiat.spring.intro.entity.Account;

public class AccountService {

  private AccountDao accountDao;

  public AccountService(AccountDao accountDao) {
    this.accountDao = accountDao;
  }

  public void add(AccountDto accountDto) {
    Account account = new Account();
    account.setEmail(accountDto.getEmail());
    account.setName(accountDto.getName());
    accountDao.save(account);
  }

}
