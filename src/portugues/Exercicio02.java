package portugues;

public class Exercicio02 {

    private String texto;

    public Exercicio02() {
    }

    public Exercicio02(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int quantidadeDeCaracteres() {
        int quantidade = 0;
        quantidade = texto.length();
        return quantidade;
    }

    public int quantidadeDeEspacoEmBranco() {
        int quantidade = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int quantidadeDeVogais() {
        texto = texto.toLowerCase();
        int quantidade = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o'
                    || texto.charAt(i) == 'u') {
                quantidade++;
            }
        }
        return quantidade;
    }

}
