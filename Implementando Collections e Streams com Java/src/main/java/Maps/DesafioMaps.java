package Maps;

import java.util.HashMap;
import java.util.Map;

public class DesafioMaps {
    public static void main(String[] args) {
        //Declarando e adicionando um hashMap com todos os 26 estados do Brasil
        HashMap<String, String> estados = new HashMap<>(EstadosBrasil.retornaEstados());
        System.out.println(estados);

        //Removendo o estado de Minas Gerais
        estados.remove("MG");
        System.out.println("A lista de estado possui Minas Gerais? " + estados.containsValue("Minas Gerais"));

        //Adicionando o Distrito Federal
        estados.put("DF", "Distrito Federal");

        //Verificando o tamanho do mapa
        System.out.println("O mapa possui cadastrado " + estados.size() + " estados");

        //Removendo o Mato Grosso do Sul usando seu valor
        estados.remove("MS", "Mato Grosso do Sul");
        System.out.println("O mapa possui Mato Grosso do Sul " + estados.containsValue("Mato Grosso do Sul"));

        //Navegando pelo mapa mostrando os valores na ordem nome-sigla
        for (Map.Entry<String, String> estado : estados.entrySet()){
            System.out.println("Nome: " + estado.getValue() + " - Sigla: " + estado.getKey());
        }

        //Verificando se o estado de Santa Catarina existe buscando por sua sigla
        System.out.println("O mapa contém o estado de Santa Catarina? " + estados.containsKey("SC"));

        //Verificando se Maranhão existe no mapa buscando por seu nome
        System.out.println("O mapa contém o estado do Maranhão? " + estados.containsValue("Maranhão"));
    }
}
