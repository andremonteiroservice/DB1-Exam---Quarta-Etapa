package matematica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercicio1Test {

    @Test
    void testEhPar() {

        Exercicio01 exercicio01 = new Exercicio01();

        Assertions.assertEquals("O valor é par", exercicio01.ehPar(42L));
        Assertions.assertEquals("O valor é impar", exercicio01.ehPar(43L));


    }

    @Test
    void testmaiorOuIgualADez() {
        Exercicio01 exercicio01 = new Exercicio01();

        Assertions.assertEquals("É maior que 10", exercicio01.maiorOuIgualADez(42L));
        Assertions.assertEquals("É menor que 10", exercicio01.maiorOuIgualADez(2L));

    }

    @Test
    void testdobroDoValor() {
        Exercicio01 exercicio01 = new Exercicio01();
        Assertions.assertEquals(84L, exercicio01.dobroDoValor(42L));
        Assertions.assertEquals(4l, exercicio01.dobroDoValor(2L));


    }

    @Test
    void testehOuNaoPrimo() {
        Exercicio01 exercicio01 = new Exercicio01();
        Assertions.assertEquals("É PRIMO", exercicio01.ehOuNaoPrimo(2L));
        Assertions.assertEquals("Não É PRIMO", exercicio01.ehOuNaoPrimo(4L));
    }
}
