import java.util.ArrayList;

class ModeloAvancado implements Celular {
    
    private ArrayList<String> historicoLigacoes;
    private ArrayList<String> historicoMensagens;

    public ModeloAvancado() {
        historicoLigacoes = new ArrayList<>();
        historicoMensagens = new ArrayList<>();
    }

    public void ligar() {
        System.out.println("Ligando o celular avançado...");
    }

    public void desligar() {
        System.out.println("Desligando o celular avançado...");
    }

    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para o número " + numero + " (celular avançado)...");
        historicoLigacoes.add("Ligação para: " + numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Mandando mensagem para o número " + numero + " (celular avançado): " + mensagem);
        historicoMensagens.add("Mensagem para: " + numero + " - " + mensagem);
    }

    public void exibirHistoricoLigacoes() {
        System.out.println("Histórico de ligações:");
        for (String ligacao : historicoLigacoes) {
            System.out.println(ligacao);
        }
    }

    public void exibirHistoricoMensagens() {
        System.out.println("Histórico de mensagens:");
        for (String mensagem : historicoMensagens) {
            System.out.println(mensagem);
        }
    }
}

