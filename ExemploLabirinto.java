public class ExemploLabirinto {
    public static void main(String[] args) {
        Labirinto labirintoSimples = new LabirintoSimples();
        labirintoSimples.criarLabirinto();

        System.out.println();

        Labirinto labirintoComplexo = new LabirintoComplexo();
        labirintoComplexo.criarLabirinto();
    }
}