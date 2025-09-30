import java.util.ArrayList;
import java.util.Arrays;

public class {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Anderson"); 
        nomes.addAll(Arrays.asList("Ricardo", "Ze", "Madalena", "Jota"));
        for (String nome: nomes) {
            System.out.println("Ola " + nome);
        }
    }
}


