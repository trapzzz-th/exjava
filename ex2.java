import java.util.Scanner;

public class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ni = 1;
        String marca = "Audi";
        String modelo = "A3";
        String cor = "Vermelho";
        double cl = 1.6;
        boolean ma = true;
        int ano = 2020;

        System.out.println("Numero de Identificação: "+ ni);
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Cor: "+ cor);
        System.out.println("Cilindrada: "+ cl);
        if(ma==true){
            System.out.println("Mudanças Automática: Sim");
        }else{
            System.out.println("Mudanças Automática: Não");
        }
        System.out.println("Ano: "+ ano);

    }
}

