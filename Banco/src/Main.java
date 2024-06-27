public class Main {
    public static void main(String[] args) throws Exception {
        
        Cliente Leonardo = new Cliente();
		Leonardo.setNomeCliente("Leonardo");
		
		Conta corrente = new ContaCorrente(Leonardo);
		Conta poupanca = new ContaPoupanca(Leonardo);

		corrente.depositar(100);
		corrente.transferir(100.00, poupanca);

        poupanca.depositar(200);
        poupanca.sacar(50);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
