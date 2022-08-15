package br.edu.ifsp.aula3.repository;

import java.util.ArrayList;

import br.edu.ifsp.aula3.model.Perfil;

public class PerfilRepository {
    
    private static PerfilRepository repo;
    private ArrayList<Perfil> perfis;

    private PerfilRepository(){
        this.perfis = new ArrayList<>();
    }

    public static void init(){
        if(PerfilRepository.repo == null){

            // Criar uma instância/objeto de PerfilRepository em repo
            
            PerfilRepository.repo = new PerfilRepository();
            
            // Adicinar perfis
            
            PerfilRepository.add(
                new Perfil(10, 10, "Jovs Gwyn", "https://i.pinimg.com/originals/91/49/af/9149af901c9cd2e444cdc7ecf89c62ae.jpg", "Brasil, Atibaia", "-.-")
            );
           
            PerfilRepository.add(
                new Perfil(15, 9, "Mirella Volkswagen", "https://pbs.twimg.com/media/E909IXmWYAQaiZH.jpg", "Brasil, Bragança", ":)")
            );
            
            PerfilRepository.add(
                new Perfil(25, 5, "Ednaldo Pereira", "https://i.scdn.co/image/ab6761610000e5eb9319d939accc1f1e22155955", "Brasil, São Paulo", ":,,(")
            );

        }else{
            System.out.println("O banco já foi inicializado.");
        }
    }

    private static void add(Perfil perfil) {
        PerfilRepository.repo.perfis.add(perfil);
    }

    public static ArrayList<Perfil> all(){
        return PerfilRepository.repo.perfis;
    }

    public static Perfil getById(int idPerfil) {
        return PerfilRepository.repo.perfis.stream().filter((perfil) -> perfil.getId() == idPerfil).toList().get(0);
    }
}
