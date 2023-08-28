package Exercicios;

public class Navio {
    private int altura;
    private int comprimento;
    private String tipo;

    public Navio(int altura, int comprimento, String tipo) {
        this.altura = altura;
        this.comprimento = comprimento;
        this.tipo = tipo;
    }

    public boolean atracar() {
        return false;
    }

    public void navegar(int navegacao) {
        System.out.println(navegacao);
    }

    public boolean sair() {
        return false;
    }

    public int getAltura() {
		return altura;
	}
	public int getComprimento() {
		return comprimento;
	}
	public String getTipo() {
		return tipo;
	}
}