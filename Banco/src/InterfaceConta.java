public interface InterfaceConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Double valor, InterfaceConta contaDestino);
    void imprimirExtrato();

}
