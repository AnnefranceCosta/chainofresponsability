public abstract class Transportador {
    protected double capacidadeMin;
    protected double capacidadeMax;
    private Transportador proximoVeiculo;

    public void setProximoVeiculo(Transportador proximoVeiculo) {
        this.proximoVeiculo = proximoVeiculo;
    }

    public abstract String getNomeVeiculo();

    public String despacharCarga(Carga carga) {
        if (carga.getPesoKg() > capacidadeMin && carga.getPesoKg() <= capacidadeMax) {
            return getNomeVeiculo();
        } else {
            if (proximoVeiculo != null) {
                return proximoVeiculo.despacharCarga(carga);
            } else {
                return "Carga fora das especificações da frota";
            }
        }
    }
}
