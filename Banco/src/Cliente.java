public class Cliente {
    private String nomeCliente;
    private String cpf;
    private String endereco;
    

    public Cliente(String nomeCliente, String cpf, String endereco) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.endereco = endereco;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "\n\tCliente\n" +
                "\nNome: '" + nomeCliente +
                "\nCpf: '" + cpf +
                "\nEndereco: '" + endereco + '\n';
    }


   

    




}
