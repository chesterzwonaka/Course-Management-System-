package com.chestermabuela.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("chestermabulela").apiInfo(apiInfo()).select().
        		paths(regex("/course.*")).build();
    }
	
	private ApiInfo apiInfo()
	{
		return new ApiInfoBuilder().title("Course API").description("chestermabulela Course API Documentstion Generated using SWAGGER2 fo Course Rest API").termsOfServiceUrl("www.linkedin.com/in/chester-mabulela-53a3092b4").
				license("chestermabulela Rest API license").licenseUrl("www.linkedin.com/in/chester-mabulela-53a3092b4").version("3.0").build();
		
	}
}
