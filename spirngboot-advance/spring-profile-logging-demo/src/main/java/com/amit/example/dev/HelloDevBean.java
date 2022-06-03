package com.amit.example.dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
class HelloDevBean {

  private static final Logger logger = LoggerFactory.getLogger(HelloDevBean.class);

  HelloDevBean(@Value("${hello.message}") String helloMessage) {
    logger.info(helloMessage);
  }

}
