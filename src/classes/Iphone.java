package classes;

import interfaces.*;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private String modelo;
    private String sistemaOperacional;

    public Iphone(String modelo, String sisttemaOperacional){
        this.modelo = modelo;
        this.sistemaOperacional = sisttemaOperacional;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void tocar(){
        System.out.println("Reproduzindo música...");
    }

    public void pausar(){
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }

    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }

    public void atender(){
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Ouvindo mensagem do correio de voz");
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    }
    
}
