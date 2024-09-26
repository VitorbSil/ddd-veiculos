public class Veiculo {
    private double valorHora;
    private double valorAdicional;
    private double horas;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicionar) {
        this.valorAdicional = valorAdicionar;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double doTotal() {
        double valor = valorHora + valorAdicional * (horas - 1);
        return valor;
    }

    public String doViewCupom() {
        return "Total do estacionamento:";
    }
}
