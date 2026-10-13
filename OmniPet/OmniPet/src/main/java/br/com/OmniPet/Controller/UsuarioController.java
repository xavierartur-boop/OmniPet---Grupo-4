package br.com.omnipet.controller;

import br.com.omnipet.model.Usuario;
import br.com.omnipet.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        usuario.setIdUsuario(null);
        return repository.save(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }
}