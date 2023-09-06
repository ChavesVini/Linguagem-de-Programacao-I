package Exercicios;

public class Jogo {
    private String estilojogo;
    private String nome;
    private int anolancamento;
    
    public Jogo(String estilojogo, String nome, int anolancamento) {
        this.estilojogo = estilojogo;
        this.nome = nome;
        this.anolancamento = anolancamento;
    }
    
    public void abrir(int abrirjogo) {
        if (abrirjogo >= 0 && abrirjogo <= 29) {
            System.out.println("Está abrindo");
        }
        else if (abrirjogo >= 30 && abrirjogo <= 60) {
            System.out.println("Está demorando um pouco...");
        }
        else {
            System.out.println("Está demorando muito!");
        }
    }

    public void jogar(int tempojogo) {
        System.out.println(tempojogo);
    }

    public void parar(int parada) {
        parada = 0;
        System.out.println("Está fechando o jogo");
    }

    public String getEstiloJogo() {
        return estilojogo;
    }
    public String getNome() {
        return nome;
    }
    public int getAnoLancamento() {
        return anolancamento;
    }
}