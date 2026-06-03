package com.green.mx.controller.special;



import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.mx.model.RequestTenant;
import com.green.mx.service.IDinamicoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/special")
public class CategoriaController {

	/**
	 * Constante JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";

	// Query para calcular inversiones
	private static final String QUERY_CRUD_CATEGORIAS= "SELECT * FROM special.crud_categoria(?,?,?)";

	// Instancia service dinamico
	@Autowired
	private IDinamicoService service;


	/**
	 * API que permite crear, modificar, baja de categorias
	 * @param request - Información con los datos a guardar, con accion a realizar
	 * @return {@link String} - Informacion general de la petición
	 */
	@PostMapping(path = "/categorias",consumes = JSON_PROD_CONS,produces = JSON_PROD_CONS)
	public String crudCategorias(@AuthenticationPrincipal Jwt jwt, @RequestBody RequestTenant request) {
		String empresaId = jwt.getClaim("tenant_id");
		UUID empresaUuid = UUID.fromString(empresaId);
	    request.setTenantID(empresaUuid);
		return service.execQueryDinamicoTenant(request, QUERY_CRUD_CATEGORIAS);
	}

}
