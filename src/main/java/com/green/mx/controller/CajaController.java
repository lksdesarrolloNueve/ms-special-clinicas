package com.green.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.Estatus;
import com.green.mx.model.request.Request;
import com.green.mx.model.response.Caja;
import com.green.mx.model.response.MovSesionCaja;
import com.green.mx.model.response.SesionCaja;
import com.green.mx.service.ICajaService;


@RestController
@CrossOrigin("*")
@RequestMapping("/warehouse")
public class CajaController {


	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";


	/**
	 * Instancia de acceso al service
	 */
	@Autowired
	private ICajaService service;


	/**
	 * API para retornar una lista de Cajas
	 * @param request - Info Request con los filtros a aplicar
	 * @return {@link Estatus<Caja>} - Estado de la solicitud con lista
	 */
	@PostMapping(path = "/getCajas",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Caja> getCajas(@RequestBody Request request){
		return service.getCajas(request);
	}

	/**
	 * API para permitir crear, modificar, baja de Cajas
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link Estatus<Caja>} - Estado de la solicitud
	 */
	@PostMapping(path = "/crudCaja",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<Caja> crudCaja(@RequestBody Request request){
		return service.crudCaja(request);
	}

	/**
	 * API para obtener las cajas disponibles para sesion ó la caja de la sesion
	 *
	 * @param usuario   - Usuario/ID para buscar sesion disponible
	 * @param almacenID - Id del almacen a filtrar
	 * @return {@link String} - Informacion en formato JSON con los datos de las
	 *         cajas
	 */
	@GetMapping(path = "/getCajasDisponibles/{usuario}/{almacenID}", produces = JSON_PROD_CONS)
	public String getCajasDisponibles(@PathVariable(value = "usuario") String usuario,
			@PathVariable(value = "almacenID") Integer almacenID) {
		return service.getCajasDisponibles(usuario, almacenID);
	}

	/**
	 * API para registrar el inicio de sesion de un cajero
	 * @param request - Informacion con los datos a registrar
	 * @return {@link String} - Informacion en formato JSON con los datos de la sesion
	 */
	@PostMapping(path = "/crudSesionCaja",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public String crudSesionCaja(@RequestBody Request request){
		return service.crudSesionCaja(request);
	}

	/**
	 * API para obtener una lista de Sesiones de Cajas
	 * @param request - Datos a filtrar
	 * @return {@link Estatus} - Estatus con la información
	 */
	@PostMapping(path = "/getSesionesCajas",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<SesionCaja> getSesionesCajas(@RequestBody Request request){
		return service.getSesionesCajas(request);
	}

	/**
	 * API para obtener una lista de Saldo movimientos sesiones
	 * @param request - Datos a filtrar
	 * @return {@link Estatus} - Estatus con la información
	 */
	@PostMapping(path = "/getMovSesion",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public Estatus<MovSesionCaja> getMovSesion(@RequestBody Request request){
		return service.getSaldoMovCaja(request);
	}

}
