package com.demo.app.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 * @author xg BLACK
 * @date 2022/9/19 13:27
 * description: Swagger配置类
 */
@Slf4j
@Configuration
@EnableOpenApi
//Knife4j增强
@EnableKnife4j
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.demo.app"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot Demo接口文档")
                .description("增删改查示例文档")
                .termsOfServiceUrl("")
                .version("1.0")
                .license("1.0")
                .licenseUrl("https://gitee.com/xgblack/bootdemo")
                .contact(new Contact("xgblack", "https://blog.xgblack.cn", "xgblack@qq.com"))
                .build();
    }
}
