package cc.magickiat.spring.intro.config;

import org.springframework.context.annotation.Bean;
import cc.magickiat.spring.intro.dao.AccountDao;
import cc.magickiat.spring.intro.dao.AccountFakeDao;
import cc.magickiat.spring.intro.dao.AccountJdbcDao;

public class DaosConfig {

  @Bean
  public AccountDao accountFakeDao() {
    return new AccountFakeDao();
  }
  
  @Bean
  public AccountDao accountJdbcDao() {
    return new AccountJdbcDao();
  }
}
