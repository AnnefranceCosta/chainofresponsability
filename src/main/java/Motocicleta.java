public class Motocicleta extends Transportador{
    public Motocicleta(Transportador superior) {
        this.capacidadeMin = 5.0;
        this.capacidadeMax = 20.0;
        setProximoVeiculo(superior);
    }
    public String getNomeVeiculo() { return "Motocicleta de Entrega"; }
}
