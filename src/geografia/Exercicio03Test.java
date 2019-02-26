package geografia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercicio03Test {

    @Test
    void testEstadoDaCidade() {
        Exercicio03 cidade = new Exercicio03("Curitiba");

        Assertions.assertEquals("É capital", cidade.gerenciarCidades().getCapital());
        Assertions.assertEquals("Pertence ao PR", cidade.gerenciarCidades().getEstado());
    }


    @Test
    void testCidadeMaringa() {
        Exercicio03 cidade = new Exercicio03("Maringá");

        Assertions.assertEquals("Não é capital", cidade.gerenciarCidades().getCapital());
        Assertions.assertEquals("Pertence ao PR", cidade.gerenciarCidades().getEstado());

    }

    @Test
    void testCidadePortoAlegre() {
        Exercicio03 cidade03 = new Exercicio03("Porto Alegre");

        Assertions.assertEquals("É capital", cidade03.gerenciarCidades().getCapital());
        Assertions.assertEquals("Pertence ao RS", cidade03.gerenciarCidades().getEstado());
    }
}
