package com.gestionador.servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestionador.modelo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
