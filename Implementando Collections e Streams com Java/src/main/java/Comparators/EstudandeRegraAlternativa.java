package Comparators;

import java.util.Comparator;

public class EstudandeRegraAlternativa implements Comparator<Estudante> {

    @Override
    public int compare(Estudante estudante1, Estudante estudante2){
        return estudante2.getIdade() - estudante1.getIdade();
    }
}
