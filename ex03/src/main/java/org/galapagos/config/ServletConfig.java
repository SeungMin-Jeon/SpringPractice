package org.galapagos.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc // 웹 MVC를 활성화
@ComponentScan(basePackages = { "org.galapagos.controller", 
								"org.galapagos.exception"
								})

public class ServletConfig implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**")
				.addResourceLocations("/resources/");
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		registry.viewResolver(bean);
	}
	
//	@Bean(name="multipartResolver")
//	public CommonsMultipartResolver getResolver() throws IOException {
//		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//		
//		resolver.setMaxUploadSize(1024*1024*40); // 40MB
//		resolver.setMaxUploadSizePerFile(1024*1024*20); // 20MB
//		resolver.setMaxInMemorySize(1024*1024); // 1MB
//		
//		resolver.setUploadTempDir(new FileSystemResource("c:\\upload\\tmp"));
//		resolver.setDefaultEncoding("UTF-8");
//		
//		return resolver;
//		
//	}
	
	
}
