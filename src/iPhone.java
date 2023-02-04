public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;

    public iPhone(String modelo) {
        this.modelo = modelo;
    }    

    public String getModelo() {
        return this.modelo;
    }

    @Override
    public void exibirPagina(String site) {
        System.out.println("Exibindo o site: " + site);        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("F5! Página atualizada.");        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);        
    }

    @Override
    public void atender(String numero, boolean opcao) {
        if (opcao) {
            System.out.println("Atendendo " + numero + "...");
        } else {
            System.out.println("Ligação de " + numero + " negada.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " selecionada.");
    }

}