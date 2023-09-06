package Exercicios;

public class Pais {
    private String idioma;
    private String moeda;        
    private String comida; 

    public Pais(String idioma, String moeda, String comida) {
        this.idioma = idioma;
        this.moeda = moeda;
        this.comida = comida;
        }
        
        public void extensaoterritorial(double tamanho) {
            System.out.println("A extensão territorial é " + tamanho);
        }

        public void presidente(String nome) {
            System.out.println("O presidente desse país é " + nome);
        }

        public void continente(String continente) {
            System.out.println("O continente desse país é " + continente);
        }

        public String getComida() {
            return comida;
        }
        public String getIdioma() {
            return idioma;
        }
        public String getMoeda() {
            return moeda;
        }
}
