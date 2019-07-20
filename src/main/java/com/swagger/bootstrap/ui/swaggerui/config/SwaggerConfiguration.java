package com.swagger.bootstrap.ui.swaggerui.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerConfiguration extends CommonApiConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("普通接口")
            .apiInfo(apiInfo("普通接口", "普通接口"))
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.swagger.bootstrap.ui.swaggerui.controller"))
            .paths(PathSelectors.any())
            .build();
    }

    @Bean
    public Docket createOtherApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("其他形式接口")
            .apiInfo(apiInfo("其他形式接口", "其他形式接口"))
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.swagger.bootstrap.ui.swaggerui.other"))
            .paths(PathSelectors.any())
            .build();
    }

}