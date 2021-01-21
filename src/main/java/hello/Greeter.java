package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Greeter {
  private static Logger log = LogManager.getLogger(Greeter.class);

  public String sayHello() {
    log.trace("trace");
    log.debug("debug");
    log.info("info");
    log.warn("warning");
    log.error("error");
    log.fatal("fatal");
    String npe = null;
    npe.length();
    return "Hello world!";
  }
}
