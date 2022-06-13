package dh.checkpoint;

public class ContratadoPj extends Funcionario {
    public double getBonus() {
        return super.getSalario() + super.getBonus();
    }
}
