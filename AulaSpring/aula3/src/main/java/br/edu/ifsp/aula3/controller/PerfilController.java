package br.edu.ifsp.aula3.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.aula3.model.Perfil;
import br.edu.ifsp.aula3.repository.PerfilRepository;

@RestController
public class PerfilController {
    
    //Método para adicionar novo perfil



    //Método para listar todos os perfis
  
    @GetMapping("/perfil")
    public List<Perfil> listarTodosPerfis(){
        return PerfilRepository.all();
    }

    @GetMapping("/perfil/{id}")
    public Perfil recuperaPerfilById(@PathVariable("id") int idPerfil){
        return PerfilRepository.getById(idPerfil);
    }

    @PostMapping("/perfil")
    public void addPerfil(
        @RequestBody
        Perfil perfil
    ){
        PerfilRepository.add(perfil);
    }

}
