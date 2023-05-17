class LabirintoSimples extends Labirinto {
    @Override
    protected void criarCaminhos() {
        System.out.println("Criando caminhos simples no labirinto...");
    }

    @Override
    protected void adicionarObstaculos() {
        System.out.println("Adicionando obstáculos simples no labirinto...");
    }
}