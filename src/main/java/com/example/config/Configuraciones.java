package com.example.config;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.example.filtros.FiltroCors;

@Configuration
public class Configuraciones {
	
	
	/*
	 * 
	 *  
	 *  
	 *  se puede omitir la clase FiltroCors(eliminarla) solo modificando la  linea 32  por:
	 *  FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean <CorsFilter>(new CorsFilter(source));
	 */
	@Bean
	public FilterRegistrationBean corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("http://localhost:8080");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		source.registerCorsConfiguration("/**", config);
		FilterRegistrationBean<FiltroCors> bean = new FilterRegistrationBean <FiltroCors>(new FiltroCors(source));
		return bean;
	}

	
}
