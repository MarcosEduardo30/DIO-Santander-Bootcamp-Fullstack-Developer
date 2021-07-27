package Optionals;

import java.util.Optional;

public class TesteOptionalsMetodos {
    public static void main(String[] args) {
        //Declarando um optional com uma string como valor
        Optional<String> optionalString = Optional.of("Valor do optional");
        //Optional<String> optionalString = Optional.empty();

        //O método isPresent irá retornar verdadeiro caso tenha algo dentro do optional e falso caso ele seja null
        System.out.println(optionalString.isPresent());
        //O isEmpty é o reverso do de cima, retornando falso para um valor e verdadeiro para um null
        System.out.println(optionalString.isEmpty());

        //Esse método irá executar a lambda apenas caso o optional não seja nulo, caso ele seja, nada será executado
        optionalString.ifPresent(System.out::println);

        //O método get retorna o valor do optional
        if (optionalString.isPresent()){
            System.out.println(optionalString.get());
        }

        //Usando a função map para modificar o valor usando uma lambda
        optionalString.map(valor -> valor.concat("****")).ifPresent(System.out::println);

        //O método orElseThrow irá lançar um erro na tela caso o optional for vazio caso tenha um valor, ele irá retorná-lo
        System.out.println(optionalString.orElseThrow(IllegalStateException::new));


    }
}
