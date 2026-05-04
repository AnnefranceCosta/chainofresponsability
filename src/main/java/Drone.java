public class Drone extends Transportador{
    public Drone(Transportador superior) {
        this.capacidadeMin = 0.0;
        this.capacidadeMax = 5.0;
        setProximoVeiculo(superior);
    }
    public String getNomeVeiculo() { return "Drone"; }
}
