package com.mytests.spring.mvc.sessionAndRequestAttrs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/8/2019.
 * Project: session-and-request-attrs
 * <p>
 * *******************************
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mytests.spring.mvc.sessionAndRequestAttrs")
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp();

    }
    /*
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.freeMarker();
    }

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer(){
        final FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/freemarker");
        return freeMarkerConfigurer;
    }
*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor());
    }

}


