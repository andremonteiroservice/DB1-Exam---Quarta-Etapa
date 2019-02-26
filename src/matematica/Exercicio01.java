package matematica;

public class Exercicio01 {

    public String ehPar(Long valor1) {

        if (valor1 % 2 == 0) {
            return "O valor é par";
        } else {
            return "O valor é impar";
        }
    }

    public String maiorOuIgualADez(Long valor2) {
        if (valor2 > 10) {
            return "É maior que 10";

        } else {
            return "É menor que 10";
        }
    }

    public Long dobroDoValor(Long valor3) {
        return valor3 * 2;
    }

    public String ehOuNaoPrimo(Long valor4) {

        int contador = 0;

        if (valor4 < 2) {
            return "n é primo";
        } else {

            for (int i = 1; i <= valor4; i++) {
                if (valor4 % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                return "É PRIMO";
            } else {
                return "Não É PRIMO";
            }

        }

    }


}




