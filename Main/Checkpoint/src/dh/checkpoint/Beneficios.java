package dh.checkpoint;

public class Beneficios {

    private double valeAlimentacao;
    private double transporte;
    private boolean temDireito;

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    public void setValeAlimentacao(double valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getTransporte() {
        return transporte;
    }

    public void setTransporte(double transporte) {
        this.transporte = transporte;
    }

    public boolean isTemDireito() {
        {
            boolean ContratadoTemporario = true;
            boolean ContratadoPj = true;

            if(ContratadoTemporario || ContratadoPj){

                return !temDireito;
            }

            return false;

        }

    }

    public void setTemDireito(boolean temDireito) {
        this.temDireito = temDireito;
    }



}
