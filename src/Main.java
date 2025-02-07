import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double Type1; //Celsius para Fahrenheit
        double Type2; //Fahrenheit para Celsius
        int escolha;  // Escolha

        double tempConvertida;

        String unidadeOri;
        String unidadecConver;


        Scanner sc = new Scanner(System.in);

        System.out.println("-=== Conversor de Temperatura ===-");
        System.out.println("Digite 1 para Celsius para Fahrenheit");
        System.out.println("Digite 2 para Fahrenheit para Celsius");
        escolha = sc.nextInt();
        System.out.println("-================================-\n");


        if (escolha == 1) { // Condição Celsius para Fahrenheit
            System.out.println("Digite o valor da temperatura em Celsius (Apenas numeros decimais): ");
            Type1 = sc.nextDouble();
             tempConvertida = (Type1 * 9/5) + 32;
             unidadeOri = "Celsius";
             unidadecConver = "Fahrenheit";

        }
        else if (escolha == 2) { // Fahrenheit para Celsius
            System.out.println("Digite o valor da temperatura em Fahrenheit (Apenas numeros decimais): ");
            Type2 = sc.nextDouble();
            tempConvertida = (Type2 - 32) * 5/9;
            unidadeOri = "Fahrenheit";
            unidadecConver = "Celsius";
        }
        else {                 // Retorno Erro
            System.out.println("Valor invalido");
            System.out.println("Coloque um valor valido entre 1 e 2: ");
            escolha = sc.nextInt();
            sc.close();
            System.out.println("Programa finalizado por excesso de tentativas");
            return;
        }

        System.out.println("\n-=== RESULTADO ===-\n");
        System.out.printf("Temperatura Convertida: %.2f %s\n", tempConvertida, unidadecConver);
        System.out.println("Unidade Original: "+unidadeOri);
        System.out.println("\n-=================-\n");

    }
}