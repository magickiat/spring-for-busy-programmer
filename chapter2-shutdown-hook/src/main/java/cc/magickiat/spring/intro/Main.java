package cc.magickiat.spring.intro;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    // create and configure beans
    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    // get instance
    Person malePerson = context.getBean("malePerson", Person.class);

    System.out.println("--------------------------");
    System.out.println("malePerson gender = " + malePerson.getGender());
    System.out.println("--------------------------");

    context.registerShutdownHook();

  }

}
