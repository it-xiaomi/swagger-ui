package com.swagger.bootstrap.ui.swaggerui.config;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

public class CommonApiConfig {

    public ApiInfo apiInfo(String title, String description) {
        return new ApiInfoBuilder()
            .title(title)
            .description(description)
            //.termsOfServiceUrl("http://localhost:8999/")
            .version("1.0")
            .contact(new Contact("xiaomi", "", ""))
            .build();
    }
}
