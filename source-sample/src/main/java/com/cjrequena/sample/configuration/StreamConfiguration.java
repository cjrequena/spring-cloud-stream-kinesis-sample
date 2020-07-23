package com.cjrequena.sample.configuration;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableBinding({StreamChannelConfiguration.class, Source.class})
@EnableBinding(StreamChannelConfiguration.class)
public class StreamConfiguration {
}
