import java.util.ArrayList;

public class Banco {
    public String nome;
    private ArrayList<Cliente> clientes;
    
    
    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }


    

}
