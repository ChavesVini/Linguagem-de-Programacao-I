package Exercicios;

public class Gato {
    private String cor;
    private double tamanho;
    private String porte;

    public Gato(String cor, double tamanho, String porte) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.porte = porte;
    }

    public boolean miar() {
        return true;
    }
    public boolean arranhar() {
        return false;
    }
    public boolean dormir() {
        return false;
    }

    public String getCor() {
        return cor;
    }
    public String getPorte() {
        return porte;
    }
    public double getTamanho() {
        return tamanho;
    }
}