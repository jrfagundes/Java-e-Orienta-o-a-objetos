package teste;
import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o seu peso: ");
        int peso = entrada.nextInt();
        
        System.out.println("Digite a sua altura");
        double altura = entrada.nextDouble();



        double imc = peso / (altura * altura);
        if (imc<18.5) {
            System.out.println("Abaixo do peso ideal");
        } else if(imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Acima do peso");
        } else if (imc < 40) {
            System.out.println("Obesidade grau 1 ou 2");
        }else {
            System.out.println("Obesidade grau 3");
            System.out.println("Muito cuidado com o seu peso");
        }

    }
}
