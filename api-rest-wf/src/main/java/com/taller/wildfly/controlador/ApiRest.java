package com.taller.wildfly.controlador;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRest {

	@GetMapping("/obtenerFecha")
	public String obtenerFechaServidor() {
		return "HOLA COMO ESTAS Fecha Actual : " + new SimpleDateFormat("dd/MM/yyyy HH:mm_ss").format(new Date());
	}

}
