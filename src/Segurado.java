public class Segurado extends Veiculo implements ISeguroService
{
    private double seguro;

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public Segurado(double seguro)
    {
        this.seguro = seguro;
    }

    @Override
    public double doDesconto()
    {
        double desconto = super.doTotal() * seguro / 10;
        return desconto;
    }
    @Override
    public double doTotal()
    {
        double totalEstacionamento = super.doTotal() - doDesconto();
        return totalEstacionamento;
    }

    @Override
    public String doViewCupom() {
        return "Valor total pago: R$" + doTotal() +
                "Valor do Desconto:" + doDesconto();
    }
}
