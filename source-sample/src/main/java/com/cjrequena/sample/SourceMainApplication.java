package com.cjrequena.sample;

import com.cjrequena.sample.service.FooSourceService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * <p>
 * <p>
 * <p>
 *
 * @author cjrequena
 * @version 1.0
 * @see
 * @since JDK1.8
 */
@Log4j2
@SpringBootApplication
@EnableAutoConfiguration
public class SourceMainApplication implements CommandLineRunner {

  private static Class<SourceMainApplication> mainApplicationClass = SourceMainApplication.class;

  @Autowired
  private FooSourceService fooSourceService;

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) {
    try {
      SpringApplication springApplication = new SpringApplication(mainApplicationClass);
      springApplication.run(args);
    } catch (Exception ex) {
      log.error("Error: " + ex);
      throw ex;
    }
  }

  @Override public void run(String... args) throws Exception {
    for (int i = 0; i < 10; i++) {
      fooSourceService.send("foo-" + i);
    }
  }

  //  @Autowired
//  private Source source;
//
//  @Scheduled(fixedRate = 2000L)
//  public void sendMessage() {
//    UUID id = UUID.randomUUID();
//    System.out.println("Before sending : " + id);
//    source.output().send(MessageBuilder.withPayload(id).build());
//    System.out.println("After sending : " + id);
//  }

}

