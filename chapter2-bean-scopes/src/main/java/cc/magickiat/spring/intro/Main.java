package cc.magickiat.spring.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    // create and configure beans
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    // get instance

    System.out.println("--------------------------");
    System.out.println("Test Singleton scope");
    Person malePerson = context.getBean("malePerson", Person.class);
    System.out.println("malePerson gender = " + malePerson.getGender());

    System.out.println("Set mailPerson gender to 'no gender'");
    malePerson.setGender("no gender");

    Person malePerson2 = context.getBean("malePerson", Person.class);
    System.out.println("malePerson2 gender = " + malePerson2.getGender());

    System.out.println("--------------------------");
    System.out.println("Test Prototype scope");
    Person femalePerson = context.getBean("femalePerson", Person.class);
    System.out.println("femalePerson gender = " + femalePerson.getGender());

    System.out.println("Set femalePerson gender to 'no gender'");
    femalePerson.setGender("no gender");

    Person femalePerson2 = context.getBean("femalePerson", Person.class);
    System.out.println("femalePerson2 gender = " + femalePerson2.getGender());
  }

}
