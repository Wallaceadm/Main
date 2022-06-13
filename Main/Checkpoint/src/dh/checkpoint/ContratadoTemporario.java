package dh.checkpoint;

public class ContratadoTemporario extends Funcionario {

    public double getBonus() {
        return super.getSalario() + super.getBonus();
    }

}
