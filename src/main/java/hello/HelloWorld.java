package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalTime;

public class HelloWorld {
  private static Logger log = LogManager.getLogger(HelloWorld.class);

  public static void main(String[] args) {
    log.trace("trace");
    log.debug("debug");
    log.info("info");
    log.warn("warning");
    log.error("error");
    log.fatal("fatal");

    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    try {
      System.out.println(greeter.sayHello());
    } catch (Exception e) {
      log.error("oops", e);
    }
  }
}
