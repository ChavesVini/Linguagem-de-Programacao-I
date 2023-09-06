package Exercicios;

public class Pessoa {

    private int velocidadeagora;
    private double tamanho;
    private int idade;
    private int peso;
    
    public Pessoa(double tamanho, int idade, int peso) {
        this.tamanho = tamanho;
        this.idade = idade;
        this.peso = peso;
    }

    public int getVelocidade() {
        return velocidadeagora;
    }
    public void setVelocidade(int velocidadeagora) {
        this.velocidadeagora = velocidadeagora;
    }
    public double getTamanho() {
        return tamanho;
    }
    public int getIdade() {
        return idade;
    }
    public int getPeso() {
        return peso;
    }
    
    public void andar(int velocidade) {
        if (velocidade > 1 && velocidade < 8) {
            System.out.println("Estamos andando " + velocidade);
        }
        else if (velocidade > 9) {
            System.out.println("Estamos correndo " + velocidade);
        }
        else {
            System.out.println("Estamos parados.");
        }
    }
}