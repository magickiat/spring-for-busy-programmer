package cc.magickiat.spring.intro;

import org.springframework.context.annotation.Bean;

public class Config {

  @Bean
  private Person malePerson() {
    Person malePerson = new Person();
    malePerson.setGender("Male");
    return malePerson;
  }

}
