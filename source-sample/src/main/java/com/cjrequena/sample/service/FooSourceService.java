package com.cjrequena.sample.service;

import com.cjrequena.sample.configuration.StreamChannelConfiguration;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * <p>
 * <p>
 * <p>
 * <p>
 * @author cjrequena
 * @version 1.0
 * @since JDK1.8
 * @see
 *
 */
@Log4j2
@Service
public class FooSourceService {

  MessageChannel fooChannelOutput;

  @Autowired
  public FooSourceService(@Qualifier(StreamChannelConfiguration.FOO_OUTPUT_CHANNEL1) MessageChannel fooChannelOutput) {
    this.fooChannelOutput = fooChannelOutput;
  }

  public void send(String foo) {
    fooChannelOutput.send(MessageBuilder.withPayload(foo).build());
    log.debug("Message sent {}", foo);
  }

}
