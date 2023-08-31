package Exercicios;

public class Cachorro {
    private String porte;
    private String raca;
    private int idade;

    public Cachorro(String porte, String raca, int idade) {
        this.porte = porte;
        this.raca = raca;
        this.idade = idade;
    }

    public boolean dormir() {
        return false;
    }

    public void correr(double velocidade) {
        if (velocidade <= 30) {
            System.out.println("Seu cachorro está andando");
        }
        else {
            System.out.println("Seu cachorro está correndo");
        }
    }

    public boolean acordar() {
        return true;
    }

    public String getPorte() {
        return porte;
    }

    public int getIdade() {
        return idade;
    }
    public String getRaca() {
        return raca;
    }
}