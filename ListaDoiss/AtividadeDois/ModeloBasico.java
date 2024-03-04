class ModeloBasico implements Celular {

    public void ligar() {
        System.out.println("Ligando o celular básico...");
    }

    public void desligar() {
        System.out.println("Desligando o celular básico...");
    }


    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para o número " + numero + " (celular básico)...");
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para o número " + numero + " (celular básico): " + mensagem);
    }
}

