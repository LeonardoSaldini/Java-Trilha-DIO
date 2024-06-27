public abstract class Conta implements InterfaceConta {

    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;

    protected int agência = 001;
    protected int numeroConta;
    protected double saldo;
    protected  Cliente cliente;

    public Conta(Cliente cliente){
        this.agência = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }
    @Override
    public void transferir(Double valor, InterfaceConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgência() {
        return agência;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfoConta(){
        System.out.println("Titular: " + this.cliente.getNomeCliente());
        System.out.println("Agência: " + this.agência);
        System.out.println("Número: " + this.numeroConta);
        System.out.println(String.format("Saldo: %.2f", this.saldo ));
    }




}
