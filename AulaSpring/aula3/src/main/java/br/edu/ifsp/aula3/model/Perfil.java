package br.edu.ifsp.aula3.model;

public class Perfil {

    private static int idCounter = 0;
    private int id, seguidores, seguindo;
    private String nome, foto, localizacao, frase;

    public Perfil(){
        this.id = ++Perfil.idCounter;
        this.nome = "Anônimo";
    }

    public Perfil(int seguidores, int seguindo, String nome, String foto, String localizacao, String frase) {
        this.id = ++Perfil.idCounter;
        this.seguidores = seguidores;
        this.seguindo = seguindo;
        this.nome = nome;
        this.foto = foto;
        this.localizacao = localizacao;
        this.frase = frase;
    }

    public int getId() {
        return id;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public int getSeguindo() {
        return seguindo;
    }

    public void setSeguindo(int seguindo) {
        this.seguindo = seguindo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    
    
}
