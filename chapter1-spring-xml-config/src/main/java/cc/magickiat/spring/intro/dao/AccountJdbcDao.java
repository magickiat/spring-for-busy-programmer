package cc.magickiat.spring.intro.dao;

import cc.magickiat.spring.intro.entity.Account;

public class AccountJdbcDao implements AccountDao {

  public void save(Account account) {
    // create JDBC connection
    // insert with SQL statement
    System.out.println("Saved with jdbc database");
  }
}
