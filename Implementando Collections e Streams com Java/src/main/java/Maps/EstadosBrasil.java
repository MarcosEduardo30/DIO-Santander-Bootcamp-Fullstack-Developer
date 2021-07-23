package Maps;

import java.util.HashMap;

public class EstadosBrasil {

    //Retorna um Hashmap com todos os estados do Brasil
    public static HashMap<String, String> retornaEstados(){
        HashMap<String, String> MapaEstados = new HashMap<>();
        MapaEstados.put("AC", "Acre");
        MapaEstados.put("AL", "Alagoas");
        MapaEstados.put("AP", "Amapá");
        MapaEstados.put("AM", "Amazonas");
        MapaEstados.put("BA", "Bahia");
        MapaEstados.put("CE", "Ceará");
        MapaEstados.put("ES", "Espírito Santo");
        MapaEstados.put("GO", "Goiás");
        MapaEstados.put("MA", "Maranhão");
        MapaEstados.put("MT", "Mato Grosso");
        MapaEstados.put("MS", "Mato Grosso do Sul");
        MapaEstados.put("MG", "Minas Gerais");
        MapaEstados.put("PA", "Pará");
        MapaEstados.put("PB", "Paraíba");
        MapaEstados.put("PR", "Paraná");
        MapaEstados.put("PE", "Pernambuco");
        MapaEstados.put("PI", "Piauí");
        MapaEstados.put("RJ", "Rio de Janeiro");
        MapaEstados.put("RN", "Rio Grande do Norte");
        MapaEstados.put("RS", "Rio Grande do Sul");
        MapaEstados.put("RO", "Rondônia");
        MapaEstados.put("RR", "Roraima");
        MapaEstados.put("SC", "Santa Catarina");
        MapaEstados.put("SP", "São Paulo");
        MapaEstados.put("SE", "Sergipe");
        MapaEstados.put("TO", "Tocantins");
        return MapaEstados;
    }
}
