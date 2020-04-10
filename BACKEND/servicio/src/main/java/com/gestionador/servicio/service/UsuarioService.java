package com.gestionador.servicio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestionador.modelo.model.Usuario;
import com.gestionador.servicio.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Optional <Usuario> getIdUsuario(Long usserId) {
		Optional<Usuario> usuario;
		usuario = usuarioRepository.findById(usserId);
		return usuario;
	} 

	public List<Usuario> getAllUsuario() {
		List<Usuario> usuario;
		usuario = usuarioRepository.findAll();
		return usuario;
	} 

}
