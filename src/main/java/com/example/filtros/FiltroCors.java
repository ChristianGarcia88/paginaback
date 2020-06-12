package com.example.filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@Component
public class FiltroCors extends CorsFilter   /* extends  CorsFilter   // forma 2 descomentar  replica los objetos extrañamente en la respuesta al cliente   (cuando es objeto)*/{

	public FiltroCors(CorsConfigurationSource configSource) {
		super(configSource); 
		// TODO Auto-generated constructor stub
	}




	
}
