abstract class Labirinto {
    public final void criarLabirinto() {
        criarCaminhos();
        adicionarObstaculos();
        exibirLabirinto();
    }

    protected abstract void criarCaminhos();
    protected abstract void adicionarObstaculos();

    protected void exibirLabirinto() {
        System.out.println("Labirinto criado!");
    }
}