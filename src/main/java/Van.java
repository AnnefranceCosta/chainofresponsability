public class Van extends Transportador {
    public Van(Transportador superior) {
        this.capacidadeMin = 20.0;
        this.capacidadeMax = 500.0;
        setProximoVeiculo(superior);
    }
    public String getNomeVeiculo() { return "Van de Carga"; }
}