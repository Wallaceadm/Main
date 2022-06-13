package dh.checkpoint;

public class Beneficios {

    private double valeAlimentacao;
    private double transporte;
    private boolean temDireito;

    public boolean recebeBeneficio(){
        boolean ContratadoTemporario = true;
        boolean ContratadoPj = true;

        if(ContratadoTemporario || ContratadoPj){

            return !temDireito;
        }

        return false;

    }
}
