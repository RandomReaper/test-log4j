package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalTime;

public class HelloWorld {
  private static Logger logger = LogManager.getLogger(HelloWorld.class);

  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    try {
      System.out.println(greeter.sayHello());
    } catch (Exception e) {
      logger.error("oups", e);
    }
  }
}
