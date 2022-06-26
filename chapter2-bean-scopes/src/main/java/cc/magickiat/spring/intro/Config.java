package cc.magickiat.spring.intro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Config {

  @Bean
  @Scope("singleton")
  private Person malePerson() {
    Person malePerson = new Person();
    malePerson.setGender("Male");
    return malePerson;
  }

  @Bean
  @Scope("prototype")
  private Person femalePerson() {
    Person malePerson = new Person();
    malePerson.setGender("Female");
    return malePerson;
  }
}
