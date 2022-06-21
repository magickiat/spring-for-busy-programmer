package cc.magickiat.spring.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import cc.magickiat.spring.intro.config.DaosConfig;
import cc.magickiat.spring.intro.config.ServicesConfig;
import cc.magickiat.spring.intro.dto.AccountDto;
import cc.magickiat.spring.intro.service.AccountService;

public class Main {

  public static void main(String[] args) {
    // create and configure beans
    System.out.println("Loading context");
    ApplicationContext context =
        new AnnotationConfigApplicationContext(DaosConfig.class, ServicesConfig.class);

    // get instance
    AccountService accountService = context.getBean("accountService", AccountService.class);
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
