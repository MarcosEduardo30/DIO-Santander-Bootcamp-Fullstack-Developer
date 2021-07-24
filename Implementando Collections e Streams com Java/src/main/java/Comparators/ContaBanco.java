package Comparators;

public class ContaBanco implements Comparable<ContaBanco>{

    //Criando os atributos da classe conta e seu construtor
    private final String numeroConta;
    private final String nomeCliente;
    private final Boolean contaAtiva;

    public ContaBanco(String numeroConta, String nomeCliente, Boolean contaAtiva){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.contaAtiva = contaAtiva;
    }

    //Getters da classe
    public String getNomeCliente() {
        return nomeCliente;
    }

    public Boolean getContaAtiva() {
        return contaAtiva;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    //Sobrescrevendo o método compareTo para que ele compare as duas strings do nome
    @Override
    public int compareTo(ContaBanco outraConta){
        return this.nomeCliente.compareTo(outraConta.nomeCliente);
    }


    //Sobrescrvendo o método toString para facilitar a leitura do código
    @Override
    public String toString(){
        return "Numero: " + this.numeroConta + " - Nome: " + this.nomeCliente;
    }

}
