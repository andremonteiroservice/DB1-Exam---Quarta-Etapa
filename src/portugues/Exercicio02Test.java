package portugues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercicio02Test {

    @Test
         void testQuantidadeCaracteresDoTexto(){
        Exercicio02 texto = new Exercicio02("DB1");
        Exercicio02 texto02 = new Exercicio02("DB1 START");

        Assertions.assertEquals(3, texto.quantidadeDeCaracteres());
        Assertions.assertEquals(9,texto02.quantidadeDeCaracteres());

    }
    @Test
         void testQuantidadeEspacosEmBranco(){
        Exercicio02 texto = new Exercicio02("DB1");
        Exercicio02 texto02 = new Exercicio02("DB1 START");

        Assertions.assertEquals(0, texto.quantidadeDeEspacoEmBranco());
        Assertions.assertEquals(1, texto02.quantidadeDeEspacoEmBranco());

    }

    @Test
         void testQuantidadeDeVogais(){
        Exercicio02 texto = new Exercicio02("DB1");
        Exercicio02 texto02 = new Exercicio02("DB1 START");

        Assertions.assertEquals(0, texto.quantidadeDeVogais());
        Assertions.assertEquals(1, texto02.quantidadeDeVogais());

    }
}
