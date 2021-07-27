package Optionals;

import java.util.Optional;

public class DesafioOptionals {
    public static void main(String[] args) {
        //Criando um optional de cada tipo possivel
        Optional<String> optionalValor = Optional.of("Com valor");
        Optional<String> optionalNull = Optional.ofNullable(null);
        Optional<String> optionalEmpty = Optional.empty();

        //Printando o valor do optional caso ele não seja nulo
        optionalNull.ifPresent((valor) ->System.out.println("O valor do optional é: " + valor));

        //Lançando uma exceção caso não tenha nenhum valor
        System.out.println("Valor do optional ou uma exceção: " + optionalValor.orElseThrow(IllegalStateException::new));

        //Mostrando o valor do optional se tiver algo e se não tiver mostrando a string "Optional Vazio"
        optionalEmpty.ifPresentOrElse(valor -> System.out.println("Valor do optional: " + valor),
                () ->System.out.println("Optional vazio"));

        //Transformando o valor caso ele esteja presente
        optionalValor.map(valor -> valor.concat(" agora concatenado")).ifPresent(System.out::println);

        //Atribuindo o valor do optional a uma variável
        if (optionalEmpty.isPresent()){
            String variavelOptional = optionalEmpty.get();
        }


        //Filtrando o optional com uma regra de negócio(Eu não entendi bem o exercício, então imagino que seja algo assim)
        if (optionalValor.isPresent()){
            if (optionalValor.get().startsWith("C")){
                System.out.println("O valor do optional está dentro das regras de negócio");
            }
        }


    }
}
