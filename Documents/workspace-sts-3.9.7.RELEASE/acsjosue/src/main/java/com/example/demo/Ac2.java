package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ac2 {

	


		
		@RequestMapping(value = "/multiplo/{valor1}/{valor2}", method = RequestMethod.GET) 
		public String multiplo(@PathVariable Integer valor1, @PathVariable Integer valor2) {
			
				
				Integer resultado;
				
				resultado = valor1 % 8;
				
				if (resultado == 0)
					return "Sim";
				else
					return "nao";		
		}
}
