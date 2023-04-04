package br.edu.infnet.assesment.apis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket docket() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.edu.infnet.assesment.apis"))
				.paths(PathSelectors.any())
				.build();
//				.apiInfo(metaInfo());
	
	}
	
//	private ApiInfo metaInfo() {
//		
//		ApiInfo apiInfo = new ApiInfo(
//				"Teste API",
//				"API de Testes",
//				"1.0",
//				"terms of service", 
//				null, 
//				"Apache License Version 2.0",
//				"https://www.apache.org/licesen.html", 
//				null
//				);
//		
//		return apiInfo;
//				
//				
//	}





}
