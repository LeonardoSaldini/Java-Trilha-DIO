public class Main {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco();
        Cliente Leonardo = new Cliente("Leonardo", "12478956406", "Rua do teste, 123");
        Cliente Rebeca = new Cliente("Rebeca", "12345678910", "Rua loucura, 125");

        banco.cadastrarCliente(Leonardo);
        banco.cadastrarCliente(Rebeca);
		
		Conta corrente = new ContaCorrente(Leonardo);
		Conta poupanca = new ContaPoupanca(Leonardo);

        Conta corrente2 = new ContaCorrente(Rebeca);
        Conta poupanca2 = new ContaPoupanca(Rebeca);

		corrente.depositar(100);
		corrente.transferir(100.00, poupanca);

        corrente2.depositar(100);
        poupanca2.depositar(500);

        poupanca.depositar(200);
        poupanca.sacar(50);

        poupanca2.transferir(100.00, corrente);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
        corrente2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        banco.listarClientes();
    }
}
