public class Usuario {
    public static void main(String[] args) {
        iPhone myMobile = new iPhone("77 Pro Max");
        myMobile.adicionarNovaAba();
        myMobile.atender("909092935253", false);
        myMobile.atualizarPagina();
        myMobile.exibirPagina("https://github.com");
        System.out.println("Modelo do meu iPhone é: " + myMobile.getModelo());
        myMobile.iniciarCorreioVoz();
        myMobile.ligar("190");
        myMobile.pausar();
        myMobile.selecionarMusica("Paradise.mp3");
        myMobile.tocar();
    }
    
}
