import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"Felipe", "Leonardo", "Gabriel", "Douglas", "Gabriela", "Joana", "Renato "}; 
        for(String candidato: candidatos) {

        }

    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas<3);

        if (atendeu){
            System.out.println("Conseguimos contato");
        }else{
            System.out.println("Não conseguimos contato");
        }

        
    }

    static boolean atender () {
        return new Random().nextInt(3)==1;
    }
    


    static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Leonardo", "Gabriel", "Douglas", "Gabriela", "Joana", "Renato "}; 
        
        System.out.println("Imprimindo a lista de candidatos");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº" + (indice + 1) + " é o" + candidatos[indice]);
        }
    }
}
