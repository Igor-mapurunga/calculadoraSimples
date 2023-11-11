import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class calculadoraApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;

        try{
            do {
                System.out.println("Digite um valor: ");
                valorUm = scanner.nextDouble();

                System.out.println("Digite a operacao (+, -, /, *): ");
                operacao = scanner.next();

                System.out.println("Digite o valor dois: ");
                valorDois = scanner.nextDouble();

                if (operacao.equals("/") && valorDois == 0){
                    System.out.println("Não é possivel dividir por zero");

                }
                System.out.println("Resultado =: " + realizarCalculo(valorUm, valorDois, operacao));
                continuar = verificarNovaOperacao();

            }while (continuar);
        }catch (InputMismatchException ex) {
            System.out.println("Os valores devem ser numericos =)");
        }




    }

    public static  boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação ? ( S ou N ) ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao){
       Double respostaCalculo = 0.0;
        switch (operacao) {
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;
            case "*":
            respostaCalculo = valorUm * valorDois;
            break;

            default:
                System.out.println("Operação é invalida =(");
        }
        return respostaCalculo;
    }
}