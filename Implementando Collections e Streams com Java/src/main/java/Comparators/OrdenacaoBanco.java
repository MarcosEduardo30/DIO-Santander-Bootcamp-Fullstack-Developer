package Comparators;

import java.util.Comparator;

public class OrdenacaoBanco implements Comparator<ContaBanco>{

    //Organiza a lista mandando para cima quem está com a conta ativa e para baixo quem não está
    @Override
    public int compare(ContaBanco conta1, ContaBanco conta2){
        if (conta1.getContaAtiva() && !conta2.getContaAtiva()){
            return  -1;
        }
        else if (conta1.getContaAtiva().equals(conta2.getContaAtiva())){
            return  0;
        }
        else {
            return 1;
        }
    }

}
