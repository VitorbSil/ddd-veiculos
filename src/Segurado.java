public class Segurado extends Veiculo implements ISeguroService {
    private double seguro;

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public Segurado(double seguro) {
        this.seguro = seguro;
    }

    @Override
    public double doDesconto() {
        double desconto = super.doTotal() * seguro / 100;
        return desconto;
    }

    @Override
    public double doTotal() {
        double totalEstacionamento = super.doTotal() - doDesconto();
        return totalEstacionamento;
    }

    @Override
    public String doViewCupom() {
        return "Valor total sem desconto: R$" + super.doTotal() +
                "\nValor total pago: R$" + doTotal() +
                "\nValor do Desconto: " + doDesconto();
    }
}