package cc.magickiat.spring.intro.dao;

import java.util.HashMap;
import cc.magickiat.spring.intro.entity.Account;

public class AccountFakeDao implements AccountDao {

  private final HashMap<String, Account> accounts = new HashMap<>();

  public void save(Account account) {
    accounts.put(account.getEmail(), account);
    System.out.println("Saved with in-memory database");
  }
}
