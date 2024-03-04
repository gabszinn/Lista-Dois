public class Main {
    public static void main(String[] args) {

    Celular celularBasico = new ModeloBasico();

           celularBasico.ligar();
    celularBasico.fazerLigacao("31990028922");
    celularBasico.enviarMensagem("987654321", "Eae, beleza?");
    celularBasico.desligar();

    Celular celularAvancado = new ModeloAvancado();

           celularAvancado.ligar();
    celularAvancado.fazerLigacao("987654321");
    celularAvancado.enviarMensagem("123456789", "Oii, tá bem?");
    celularAvancado.fazerLigacao("555");
    celularAvancado.enviarMensagem("444", "Atendee");
        celularAvancado.desligar();

    ModeloAvancado modeloAvancado = (ModeloAvancado) celularAvancado;
        modeloAvancado.exibirHistoricoLigacoes();
        modeloAvancado.exibirHistoricoMensagens();
    }
}
