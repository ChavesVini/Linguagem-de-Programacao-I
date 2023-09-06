package Exercicios;

public class Teste {
    public static void main(String[] args) {
        Celular c1=new Celular("branco","180x260","6.6");
        System.out.println("A nota do desempenho, cor e o tamanho é: " + c1.getDesempenho() + ", " + c1.getCor() + ", " +  c1.getTamanho());
        System.out.println(c1.ligar());
        c1.marca("samsung");
        c1.resolucaocamera(10);        
        Celular c2=new Celular("preto","200x560","8.2");
        System.out.println("A nota do desempenho, cor e o tamanho é: " + c2.getDesempenho() + ", " + c2.getCor() + ", " +  c2.getTamanho());
        System.out.println(c2.ligar());
        c2.marca("motorola");
        c2.resolucaocamera(20);
        System.out.println("\n");
    
        Computador com1=new Computador("R5 230","Ryzen 7 3700x",8);
        System.out.println("A placa de video, processador e a memoria ram é: " + com1.getPlacaVideo() + ", " + com1.getProcessador() + ", " + com1.getMemoria());
        System.out.println(com1.ligar());
        com1.notadesempenho(6);
        com1.tamanhogabinete("300x201");
        Computador com2=new Computador("GTX 1080","I5 3500",16);
        System.out.println("A placa de video, processador e a memoria ram é: " + com2.getPlacaVideo() + ", " + com2.getProcessador() + ", " + com2.getMemoria());
        System.out.println(com2.ligar());
        com2.notadesempenho(10);
        com2.tamanhogabinete("500x900");
        System.out.println("\n");

        Pais p1 = new Pais("Espanhol", "Euro", "Paella");
        System.out.println("Esse país fala " + p1.getIdioma() + " a moeda dele é " + p1.getMoeda() + " e a comida tipica é " + p1.getComida());
        p1.extensaoterritorial(400);
        p1.presidente("lula");
        p1.continente("ásia");
        Pais p2 = new Pais("Português", "Real", "Feijoada");
        System.out.println("Esse país fala " + p2.getIdioma() + " a moeda dele é " + p2.getMoeda() + " e a comida tipica é " + p2.getComida());
        p2.extensaoterritorial(1000);
        p2.presidente("bolsonaro");
        p2.continente("áfrica");
        System.out.println("\n");
    
        Pessoa pes1 = new Pessoa(1.60, 18, 60);
        System.out.println("A pessoa tem " + pes1.getIdade() + " o tamanho dele é " + pes1.getTamanho() + " e o peso é " + pes1.getPeso());
        System.out.println(pes1.getVelocidade());
        pes1.andar(0);
        pes1.andar(5);
        pes1.andar(16);
        Pessoa pes2 = new Pessoa(1.80, 20, 80);
        System.out.println("A pessoa tem " + pes2.getIdade() + " o tamanho dele é " + pes2.getTamanho() + " e o peso é " + pes2.getPeso());
        System.out.println(pes2.getVelocidade());
        pes2.andar(0);
        pes2.andar(2);
        pes2.andar(10);
        System.out.println("\n");

        Jogo jogo1 = new Jogo("MetroidVania", "Hollow Knight", 2017);
        System.out.println("O estilo de jogo é " + jogo1.getEstiloJogo() + ", o nome é " + jogo1.getNome() + ", e o ano de lançamento é " + jogo1.getAnoLancamento());
        jogo1.jogar(0);
        jogo1.parar(10);
        jogo1.abrir(10);
        jogo1.abrir(30);
        jogo1.abrir(61);
        Jogo jogo2 = new Jogo("Ação", "Ace Combat 6", 2007);
        System.out.println("O estilo de jogo é " + jogo2.getEstiloJogo() + ", o nome é " + jogo2.getNome() + ", e o ano de lançamento é " + jogo2.getAnoLancamento());
        jogo2.jogar(20);
        jogo2.parar(0);
        jogo2.abrir(0);
        jogo2.abrir(50);
        jogo2.abrir(70);
        System.out.println("\n");

        Aviao aviao1 = new Aviao(17, "MIG-29", "Caça");
        System.out.println("O tamanho do avião é " + aviao1.getTamanho() + ", o modelo é " + aviao1.getModelo() + ", e a categoria é " + aviao1.getCategoria());
        aviao1.voar(2411);
        System.out.println(aviao1.subir());
        System.out.println(aviao1.pousar());   
        Aviao aviao2 = new Aviao(21, "Su-33", "Caça");
        System.out.println("O tamanho do avião é " + aviao2.getTamanho() + ", o modelo é " + aviao2.getModelo() + ", e a categoria é " + aviao2.getCategoria());
        aviao2.voar(1050);
        System.out.println(aviao2.subir());
        System.out.println(aviao2.pousar());      
        System.out.println("\n");

        Navio navio1 = new Navio(53, 269, "Navio para passageiros");
        System.out.println("O navio tem de altura " + navio1.getAltura() + ", de comprimento " + navio1.getComprimento() + ", e o tipo é " + navio1.getTipo());
        System.out.println(navio1.atracar());
        navio1.navegar(10);
        System.out.println(navio1.sair());
        Navio navio2 = new Navio(38, 333, "Cruzeiro");
        System.out.println("O navio tem de altura " + navio2.getAltura() + ", de comprimento " + navio2.getComprimento() + ", e o tipo é " + navio2.getTipo());
        System.out.println(navio2.atracar());
        navio2.navegar(30);
        System.out.println(navio2.sair());
        System.out.println("\n");

        FigurasGeometricas fig1 = new FigurasGeometricas("Quadrilátero", 4, "Losango");
        System.out.println(fig1.getLados() + " " + fig1.getTipo() + " " + fig1.getNome());
        fig1.calcularQuadrado(30, 30);
        FigurasGeometricas fig2 = new FigurasGeometricas("Redondo", 0, "Circulo");
        System.out.println(fig2.getLados() + " " + fig2.getTipo() + " " + fig2.getNome());
        fig2.calcularCirculo(12);
        FigurasGeometricas fig3 = new FigurasGeometricas("Triângular", 3, "Triângulo");
        System.out.println(fig3.getLados() + " " + fig3.getTipo() + " " + fig3.getNome());
        fig3.calcularTriangulo(30, 12);
        System.out.println("\n");

        Cachorro cach1 = new Cachorro("pequeno", "bulldog", 3);
        System.out.println("O cachorro tem o porte " + cach1.getPorte() + "com a raça " + cach1.getRaca() + "e com a idade " + cach1.getIdade());
        System.out.println(cach1.acordar());
        cach1.correr(20);
        cach1.correr(40);
        System.out.println(cach1.dormir());
        Cachorro cach2 = new Cachorro("grande", "doberman", 8);
        System.out.println("O cachorro tem o porte " + cach2.getPorte() + "com a raça " + cach2.getRaca() + "e com a idade " + cach2.getIdade());
        System.out.println(cach2.acordar());
        cach2.correr(10);
        cach2.correr(60);
        System.out.println(cach2.dormir());
        System.out.println("\n");

        Gato gato1 = new Gato("laranja", 40, "pequeno");
        System.out.println("Esse gato é de cor " + gato1.getCor() + ", com tamanho " + gato1.getTamanho() + ", e o porte é " + gato1.getPorte());
        System.out.println(gato1.miar());
        System.out.println(gato1.arranhar());
        System.out.println(gato1.dormir());
        Gato gato2 = new Gato("preto", 50, "médio");
        System.out.println("Esse gato é de cor " + gato2.getCor() + ", com tamanho " + gato2.getTamanho() + ", e o porte é " + gato2.getPorte());     
        System.out.println(gato2.miar());
        System.out.println(gato2.arranhar());
        System.out.println(gato2.dormir());   
    }
}
