package cc.magickiat.spring.intro;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Config {

  @Bean
  @Scope(value = BeanDefinition.SCOPE_SINGLETON)
  private Person malePerson() {
    Person malePerson = new Person();
    malePerson.setGender("Male");
    return malePerson;
  }

  @Bean
  @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
  private Person femalePerson() {
    Person malePerson = new Person();
    malePerson.setGender("Female");
    return malePerson;
  }
}
