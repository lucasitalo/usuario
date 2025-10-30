package com.lucasitalo.usuario.business;

import com.lucasitalo.usuario.business.converter.UsuarioConverter;
import com.lucasitalo.usuario.business.dto.UsuarioDTO;
import com.lucasitalo.usuario.infrastructure.entity.Usuario;
import com.lucasitalo.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(
                usuarioRepository.save(usuario));

    }

}
