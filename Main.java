package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite as informações das pessoas (nome - gênero), digite 'fim' para parar:");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            String[] info = entrada.split("-");
            String nome = info[0].trim();
            String genero = info[1].trim();
            pessoas.add(new Pessoa(nome, genero));
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("feminino"))
                .collect(Collectors.toList());

        System.out.println("Mulheres na lista:");
        mulheres.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getGenero()));
    }
}
