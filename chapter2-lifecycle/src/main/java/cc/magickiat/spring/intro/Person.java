package cc.magickiat.spring.intro;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {

  private String gender;

  @PostConstruct
  public void init() {
    System.out.println("Init called");
    System.out.println("Gender = " + gender);
  }

  @PreDestroy
  public void clearData() {
    System.out.println("Before destroy object called");
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
