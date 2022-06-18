package CursoJava;

import java.util.Scanner; //leitura de dados

public class Exercicio2 {
    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o dia:\n");
        dia = ler.nextInt();
        System.out.print("Digite o mes:\n");
        mes = ler.nextInt();
        System.out.print("Digite o ano:\n");
        ano = ler.nextInt();
        if(mes >= 1 && mes <= 12) {
            // Data Válida
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
                if(dia >= 1 && dia <= 31) {
                    System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                } else {
                    // Dia inválido
                    System.out.println("Data Inválida");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if(dia >= 1 && dia <= 30) {
                    System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                } else {
                    // Dia inválido
                    System.out.println("Data Inválida");
                }
            } else if (mes == 2) {
                if(((ano % 400) == 0) || (((ano % 4) == 0) && ((ano % 100) != 0))){
                    // Fevereiro tem 29 dias
                    if(dia >= 1 && dia <= 29) {
                        System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                    } else {
                        // Dia inválido
                        System.out.println("Data Inválida");
                    }
                } else {
                    // Fevereiro tem 28 dias
                    if(dia >= 1 && dia <= 28) {
                        System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
                    } else {
                        // Dia inválido
                        System.out.println("Data Inválida");
                    }
                }
            }
        } else {
            // Mes invalido
            System.out.println("Data Inválida");
        }
    }
}