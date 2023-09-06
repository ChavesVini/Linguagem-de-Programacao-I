package Exercicios;

public class Computador {

    private String placavideo;
    private String processador;
    private int memoriaram;
    
    public Computador(String placavideo, String processador, int memoriaram) {
        this.placavideo = placavideo;
        this.processador = processador;
        this.memoriaram = memoriaram;
    }
    
    public boolean ligar() {
        return true;
    }

    public void notadesempenho(double desempenho) {
        System.out.println("A marca do celular é " + desempenho);
    }
    
    public void tamanhogabinete(String dimensao) {
        System.out.println("A resolução da câmera é " + dimensao);
    }
    
    public String getPlacaVideo() {
        return placavideo;
    }
    public String getProcessador() {
        return processador;
    }
    public int getMemoria() {
        return memoriaram;
    }
}