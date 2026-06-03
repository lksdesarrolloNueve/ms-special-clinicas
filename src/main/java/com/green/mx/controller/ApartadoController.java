package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Apartado;
import com.green.mx.service.IApartadoService;


@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class ApartadoController {

	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";


	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private IApartadoService service;


	/**
	 * API para listar las ventas/movimientos por sesion
	 * @param reqBusqueda - Datos a filtrar
	 * @return {@link Estatus<Apartado>} - Estatus con respuesta
	 */
	@PostMapping(path = "/getApartados",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Apartado> getVentasXFPXSesion(@RequestBody Request request){
		return service.getApartados(request);
	}


}
