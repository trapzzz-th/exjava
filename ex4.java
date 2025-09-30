import java.util.Scanner;

public class CarroInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int po;
        int caixa;
        int so;
        int ni = 124;
        double cili;

        System.out.println("Qual a marca do teu carro?");
        System.out.println("1-Mercedes");
        System.out.println("2-Porsche");
        System.out.println("3-Outro");
        po = scanner.nextInt();

        System.out.println("Quantas cilindradas tem o teu carro?");
        cili = scanner.nextDouble();

        System.out.println("Quais as tuas mudanças?");
        System.out.println("1-Automaticas");
        System.out.println("2-Manual");
        caixa = scanner.nextInt();

        System.out.println("NºIdentificação: " + ni);
        System.out.println("Quer alterar?");
        System.out.println("1-Sim");
        System.out.println("2-Não");
        so = scanner.nextInt();

        if (so == 1){
            System.out.println("Escreve o NºIdentificação:");
            ni = scanner.nextInt();
        }

        System.out.println("Informações:");
        if (po == 1){
            System.out.println("Mercedes");
        } else if (po == 2){
            System.out.println("Porsche");
        } else {
            System.out.println("Outro fabricante");
        }

        if (cili >= 2000){
            System.out.println("Motor potente");
        } else {
            System.out.println("Motor moderado");
        }

        if (caixa == 1){
            System.out.println("Caixa automatica");
        } else {
            System.out.println("Caixa manual");
        }

        System.out.println("NºIdentificação: " + ni);
    }
}


