package com.example.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.controlador.model.Persona;
@CrossOrigin(origins = "*")
@RestController
public class Controla {
	
	

	@GetMapping("/getPersona")
	public Persona  getPersona(@RequestHeader("Authorization") String  Authorization) {
	  
		if (Authorization.equals("Basic Zm94Omp1bGlhbg==")) {
	

			return  new Persona(1, "fox", "julian");
		}
		return   new  Persona(0, "no existe nombre","no existe apellido");
		
	
	
	}

}
