package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import java.util.List;

class PessoaTest {

    @Test
    void testApenasMulheres() {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Maria", "Feminino"),
            new Pessoa("João", "Masculino"),
            new Pessoa("Ana", "Feminino")
        );

        boolean todasMulheres = pessoas.stream()
                                      .allMatch(pessoa -> pessoa.getGenero().equalsIgnoreCase("Feminino"));

        assertTrue(todasMulheres, "A lista deve conter apenas mulheres.");
    }
}
