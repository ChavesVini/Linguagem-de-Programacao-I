package Exercicios;

public class Celular {
    private String cor;
    private String tamanho;
    private String notadesempenho;

    public Celular(String cor, String tamanho, String notadesempenho) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.notadesempenho = notadesempenho;
    }

    public boolean ligar() {
        return true;
    }

    public void marca(String marca) {
        System.out.println("A marca do celular é " + marca);
    }

    public void resolucaocamera(double resolucaocamera) {
        System.out.println("A resolução da câmera é " + resolucaocamera);
    }

    public String getCor() {
		return cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public String getDesempenho() {
		return notadesempenho;
	}
}
