import classes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone("Iphone 1", "IOS 1.0");

        System.out.println("Funções do Ipod");
        iphone.selecionarMusica("Playa playa - D'Angelo");
        iphone.tocar();
        iphone.pausar();
        System.out.println("Finalizando as funções do Ipod \n");

        System.out.println("Funções do telefone");
        iphone.ligar("30302528");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("Finalizando as funções do telefone \n");

        System.out.println("Funções do navegador");
        iphone.exibirPagina("https://www.linkedin.com/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("Finalizando as funções do navegador");
    }
}

