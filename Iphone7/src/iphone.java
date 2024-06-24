public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    int volume = 10;

    
    // implementação dos métodos do AparelhoTelefônico 
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida !");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    //Implementação dos métodos NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo a página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada !");
    }

    //Implementando métodos Reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo " + musica);
    }

    @Override
    public void aumentarVolume() {
        volume += 1;
        System.out.println("Volume: " + volume);
    }

    @Override
    public void diminuirVolume() {
        volume -= 1;
        System.out.println("Volume: " + volume);
    }



}
