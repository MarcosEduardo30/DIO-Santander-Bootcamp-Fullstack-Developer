package Optionals;

import java.util.Optional;
import java.util.OptionalInt;

public class TesteOptionals {

    public static void main(String[] args) {
        //Declarando nosso optional e atribuindo um valor não nulo para ele
        Optional<String> optionalString = Optional.of("Valor Presente");


        //Verificando se o optional está nulo ou não com o método ifPresentOrElse, caso ele não seja nulo é executado a primeira
        //função lambda, caso ele seja é executado a segunda.
        System.out.println("Com o optional com um valor não nulo: ");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está vazio"));

        //Testando o método acima usando um optional nulo, como ele está nulo será executado a segunda lambda.
        //Lembrando que o of não pode receber um valor nulo, já o ofNullable pode receber tanto um valor quanto um nulo.
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Com o optional de valor nulo: ");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("O valor optional está vazio"));

        //Utilizando uma sintaxe diferente para declarar um optional nulo, dessa vez usando o empty.
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("Com um optional nulo criado pelo empty: ");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("O valor do optional está vazio(Feito pelo empty)"));

        //Tentando construir um optional nulo usando o of e não ofNullable, dessa forma irá estourar um erro de NullPointerException.
        //Optional<String> optionalOfNull = Optional.of(null);


        //Usando um optional especial para números inteiros, também existe para doubles e longs
        OptionalInt optionalInt = OptionalInt.of(12);
        System.out.println("Com um OptionalInt: ");
        optionalInt.ifPresentOrElse(System.out::println, () -> System.out.println("O optional está vazio"));
    }
}
