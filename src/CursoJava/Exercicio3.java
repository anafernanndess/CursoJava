package CursoJava;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int n1,n2;
        String operador;
        System.out.println("Entre com a operação a ser realizada (+, - ou *):");
        operador = entrada.next();
        System.out.println("Entre com o primeiro número:");
        n1 = entrada.nextInt();
        System.out.println("Entre com o segundo número:");
        n2 = entrada.nextInt();

        switch (operador){
            case "+":
                System.out.println("O resultado da operação é: " + (n1 + n2));
                break;
            case "-":
                System.out.println("O resultado da operação é: " + (n1 - n2));
                break;
            case "*":
                System.out.println("O resultado da operação é: " + (n1 * n2));
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
