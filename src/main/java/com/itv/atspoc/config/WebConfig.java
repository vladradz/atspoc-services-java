package com.itv.atspoc.config;

import com.itv.atspoc.campaign.CampaignController;
import com.itv.atspoc.index.IndexController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;

/**
 * Created by neilmoor on 20/02/14.
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    final Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Bean
    public IndexController indexController() {
        return new IndexController();
    }

    @Bean
    public CampaignController campaignController() {
        return new CampaignController();
    }

    // equivalent for <mvc:default-servlet-handler/> tag
    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
    }

    // equivalents for <mvc:resources/> tags
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(300);
        registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(300);
        registry.addResourceHandler("/lib/**").addResourceLocations("/lib/").setCachePeriod(300);
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}

