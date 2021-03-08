package com.passbook;

import com.passbook.security.AuthCheckInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;

@SpringBootApplication(scanBasePackages = {"com.passbook.service", "com.passbook.security","com.passbook.controller"})
//@ComponentScan({"com.passbook.controller", "com.passbook.security", "com.passbook.service"})
public class MerchantsApplication extends WebMvcConfigurationSupport {
	@Resource
	private AuthCheckInterceptor authCheckInterceptor;

	public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(authCheckInterceptor)
					.addPathPatterns("/merchants/**");
			super.addInterceptors(registry);
	}

	public static void main(String[] args) {
		SpringApplication.run(MerchantsApplication.class, args);
	}

}
