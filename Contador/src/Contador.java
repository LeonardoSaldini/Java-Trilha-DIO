import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = parametroUm + 1; i < parametroDois; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class ParametrosInvalidosException extends Exception {
    // Classe de exceção personalizada para indicar que os parâmetros são inválidos
}
