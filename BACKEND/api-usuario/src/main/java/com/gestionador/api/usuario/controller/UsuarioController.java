package com.gestionador.api.usuario.controller;

import java.util.List;
import java.util.Optional;
import com.gestionador.modelo.model.Usuario;
import com.gestionador.servicio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

/* 	@GetMapping("/api/buscarIdUsuario/{id}")
	public ResponseEntity<?> getUsuarioId(@PathVariable long id) {
		Optional usuario = usuarioService.getIdUsuario(id);
		if (usuario.isPresent()) {
			return new ResponseEntity<>(usuario, HttpStatus.OK);

		} else {
			return new ResponseEntity<>("no encotrada", HttpStatus.NO_CONTENT);
		}
	} */

    //ESTA SE USA PARA VER LA CONEXION CON EL FRONT
	@GetMapping("/api/usuario")
	public List<Usuario> getDomicilio() {
		return usuarioService.getAllUsuario();
	}

}