package cc.magickiat.spring.intro.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import cc.magickiat.spring.intro.dao.AccountDao;
import cc.magickiat.spring.intro.service.AccountService;

@Configuration
public class ServicesConfig {
  @Bean
  public AccountService accountService(@Qualifier("accountFakeDao") AccountDao accountDao) {
    return new AccountService(accountDao);
  }
}
