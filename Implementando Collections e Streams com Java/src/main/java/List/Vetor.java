package List;

import java.util.List;
import java.util.Vector;

public class Vetor {
    public static void main(String[] args) {

        List<String> pessoas = new Vector<>();
        pessoas.add("André");
        pessoas.add("Bárbara");
        pessoas.add("Carla");
        pessoas.add("Davi");

        System.out.println(pessoas);

        pessoas.set(2, "Bianca");
        System.out.println(pessoas);

        pessoas.remove(2);
        System.out.println(pessoas);


        System.out.println(pessoas.get(1));

        for (String pessoa : pessoas){
            System.out.println(pessoa);
        }




    }
}
