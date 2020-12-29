package com.salesmanager.shop.application.config;


import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class ShopizerPropertiesConfig {
	protected final Log logger = LogFactory.getLog(getClass());
  @Bean
  public List<String> templates() {
	  logger.debug("call ... templates()");
    return Arrays.asList("bootstrap", "generic", "exoticamobilia", "december");
  }

  @Bean(name = "shopizer-properties")
  public PropertiesFactoryBean mapper() {
    PropertiesFactoryBean bean = new PropertiesFactoryBean();
    bean.setLocation(new ClassPathResource("shopizer-properties.properties"));
    return bean;
  }
}
