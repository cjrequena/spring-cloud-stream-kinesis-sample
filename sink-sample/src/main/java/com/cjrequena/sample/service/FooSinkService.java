package com.cjrequena.sample.service;

import com.cjrequena.sample.configuration.StreamChannelConfiguration;
import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.stream.annotation.StreamListener;
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
public class FooSinkService {

  @StreamListener(value = StreamChannelConfiguration.FOO_INPUT_CHANNEL1)
  public synchronized void listener(String foo) throws InterruptedException {
    log.debug("Channel 1 Input message -> {}", foo);
    wait(1000);
  }

}
