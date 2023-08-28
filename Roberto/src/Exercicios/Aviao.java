package Exercicios;

public class Aviao {

    private int velocidade;
    private int tamanho;
    private String modelo;
    private String categoria;
    
    public Aviao(int tamanho, String modelo, String categoria) {
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.categoria = categoria;
    }
    
    public void voar (int velocidade) {
        if (velocidade >= 1 && velocidade <= 2878) {
            System.out.println("Estamos voando " + velocidade);
        }
    }

    public boolean subir () {
        return true;
    }

    public boolean pousar() {
        return false;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public double getTamanho() {
        return tamanho;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCategoria() {
        return categoria;
    }
}