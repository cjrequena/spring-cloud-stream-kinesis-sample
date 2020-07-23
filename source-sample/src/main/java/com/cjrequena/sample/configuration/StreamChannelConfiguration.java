package com.cjrequena.sample.configuration;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface StreamChannelConfiguration {

  String FOO_OUTPUT_CHANNEL1 = "foo_output_channel_1";

  @Output(FOO_OUTPUT_CHANNEL1)
  MessageChannel fooOutputChannel1();
}
