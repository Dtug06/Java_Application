package com.baitap.bai1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;


// đánh dấu lớp cấu hình
@Configuration
// bật sử dụng web mvc
@EnableWebMvc
// sử dụng scan để quét các bean
@ComponentScan(basePackages = "com.baitap")
public class WebConfig {
    //Bean
    @Bean
    public SpringResourceTemplateResolver templateResolver(){
        SpringResourceTemplateResolver resolver =new SpringResourceTemplateResolver();

        resolver.setPrefix("/WEB-INF/templates/");//views-> templates
        resolver.setSuffix(".html");//isp -> html
        resolver.setCharacterEncoding("UTF-8");
        return resolver;

    }

    @Bean
    public SpringTemplateEngine templateEngine(){

        SpringTemplateEngine engine =new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());

//        engine.setDialect(new LayoutDialect());
        return engine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }

}

