package Exercicios;

public class Teste {
    public static void main(String[] args) {
        Celular c1=new Celular("branco","180x260","6.6");
        System.out.println("A nota do desempenho, cor e o tamanho é: " + c1.getDesempenho() + ", " + c1.getCor() + ", " +  c1.getTamanho());
        Celular c2=new Celular("preto","200x560","8.2");
        System.out.println("A nota do desempenho, cor e o tamanho é: " + c2.getDesempenho() + ", " + c2.getCor() + ", " +  c2.getTamanho());
    
        Computador com1=new Computador("R5 230","Ryzen 7 3700x",8);
        System.out.println("A placa de video, processador e a memoria ram é: " + com1.getPlacaVideo() + ", " + com1.getProcessador() + ", " + com1.getMemoria());
        Computador com2=new Computador("GTX 1080","I5 3500",16);
        System.out.println("A placa de video, processador e a memoria ram é: " + com2.getPlacaVideo() + ", " + com2.getProcessador() + ", " + com2.getMemoria());
        
        Pais p1 = new Pais("Espanhol", "Euro", "Paella");
        System.out.println("Esse país fala " + p1.getIdioma() + " a moeda dele é " + p1.getMoeda() + " e a comida tipica é " + p1.getComida());
        Pais p2 = new Pais("Português", "Real", "Feijoada");
        System.out.println("Esse país fala " + p2.getIdioma() + " a moeda dele é " + p2.getMoeda() + " e a comida tipica é " + p2.getComida());
    
        Pessoa pes1 = new Pessoa(1.60, 18, 60);
        System.out.println("A pessoa tem " + pes1.getIdade() + " o tamanho dele é " + pes1.getTamanho() + " e o peso é " + pes1.getPeso());
        pes1.setVelocidade(5);
        System.out.println(pes1.getVelocidade());
        Pessoa pes2 = new Pessoa(1.80, 20, 80);
        System.out.println("A pessoa tem " + pes2.getIdade() + " o tamanho dele é " + pes2.getTamanho() + " e o peso é " + pes2.getPeso());
        pes2.setVelocidade(10);
        System.out.println(pes2.getVelocidade());

        Jogo jogo1 = new Jogo("MetroidVania", "Hollow Knight", 2017);
        System.out.println("O estilo de jogo é " + jogo1.getEstiloJogo() + ", o nome é " + jogo1.getNome() + ", e o ano de lançamento é " + jogo1.getAnoLancamento());
        Jogo jogo2 = new Jogo("Ação", "Ace Combat 6", 2007);
        System.out.println("O estilo de jogo é " + jogo2.getEstiloJogo() + ", o nome é " + jogo2.getNome() + ", e o ano de lançamento é " + jogo2.getAnoLancamento());
        
        Aviao aviao1 = new Aviao(17, "MIG-29", "Caça");
        System.out.println("O tamanho do avião é " + aviao1.getTamanho() + ", o modelo é " + aviao1.getModelo() + ", e a categoria é " + aviao1.getCategoria());
        aviao1.setVelocidade(1460);
        System.out.println(aviao1.getVelocidade());
        Aviao aviao2 = new Aviao(21, "Su-33", "Caça");
        System.out.println("O tamanho do avião é " + aviao2.getTamanho() + ", o modelo é " + aviao2.getModelo() + ", e a categoria é " + aviao2.getCategoria());
        aviao2.setVelocidade(15);
        System.out.println(aviao2.getVelocidade());

        Navio navio1 = new Navio(53, 269, "Navio para passageiros");
        System.out.println("O navio tem de altura " + navio1.getAltura() + ", de comprimento " + navio1.getComprimento() + ", e o tipo é " + navio1.getTipo());
        Navio navio2 = new Navio(38, 333, "Cruzeiro");
        System.out.println("O navio tem de altura " + navio2.getAltura() + ", de comprimento " + navio2.getComprimento() + ", e o tipo é " + navio2.getTipo());

        FigurasGeometricas fig1 = new FigurasGeometricas("Quadrilátero", 4, "Losango");
        System.out.println(fig1.getLados() + " " + fig1.getTipo() + " " + fig1.getNome());
        FigurasGeometricas fig2 = new FigurasGeometricas("Redondo", 0, "Circulo");
        System.out.println(fig2.getLados() + " " + fig2.getTipo() + " " + fig2.getNome());

        Cachorro cach1 = new Cachorro("pequeno", "bulldog", 3);
        System.out.println("O cachorro tem o porte " + cach1.getPorte() + "com a raça " + cach1.getRaca() + "e com a idade " + cach1.getIdade());
        Cachorro cach2 = new Cachorro("grande", "doberman", 8);
        System.out.println("O cachorro tem o porte " + cach2.getPorte() + "com a raça " + cach2.getRaca() + "e com a idade " + cach2.getIdade());

        Gato gato1 = new Gato("laranja", 40, "pequeno");
        System.out.println("Esse gato é de cor " + gato1.getCor() + ", com tamanho " + gato1.getTamanho() + ", e o porte é " + gato1.getPorte());
        Gato gato2 = new Gato("preto", 50, "médio");
        System.out.println("Esse gato é de cor " + gato2.getCor() + ", com tamanho " + gato2.getTamanho() + ", e o porte é " + gato2.getPorte());        
    }
}
