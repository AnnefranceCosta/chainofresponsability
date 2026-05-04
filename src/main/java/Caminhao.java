public class Caminhao extends Transportador{
    public Caminhao(Transportador superior) {
        this.capacidadeMin = 500.0;
        this.capacidadeMax = 5000.0;
        setProximoVeiculo(superior);
    }
    public String getNomeVeiculo() { return "Caminhão Baú"; }
}
