package cc.magickiat.spring.intro;

import cc.magickiat.spring.intro.dao.AccountJdbcDao;
import cc.magickiat.spring.intro.dto.AccountDto;
import cc.magickiat.spring.intro.service.AccountService;

public class Main {

  public static void main(String[] args) {
    System.out.println("create and configure instance");
    // AccountFakeDao accountDao = new AccountFakeDao();
    AccountJdbcDao accountDao = new AccountJdbcDao();
    AccountService accountService = new AccountService(accountDao);

    System.out.println("--------------------------");

    // add an account
    System.out.println("Create an account");
    AccountDto dto = new AccountDto();
    dto.setEmail("magic@gmail.com");
    dto.setName("MagicKiat");
    accountService.add(dto);

    System.out.println("--------------------------");

  }

}
