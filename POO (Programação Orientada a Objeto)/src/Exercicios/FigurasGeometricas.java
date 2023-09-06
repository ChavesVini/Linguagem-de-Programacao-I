package Exercicios;

public class FigurasGeometricas {
    private String tipo;
    private int lados;
    private String nome;
    
    public FigurasGeometricas(String tipo, int lados, String nome) {
        this.tipo = tipo;
        this.lados = lados;
        this.nome = nome;
    }

    public void calcularQuadrado(int base, int altura) {
        System.out.println(base*altura);
    }

    public void calcularCirculo(int raio) {
        System.out.println(3.14*(raio^2));
    }

    public void calcularTriangulo(int base, int altura) {
        System.out.println((base*altura)/2);
    }

    public String getTipo() {
        return tipo;
    }
    public int getLados() {
        return lados;
    }
    public String getNome() {
        return nome;
    }
}