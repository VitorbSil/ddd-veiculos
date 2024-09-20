public class BalancoDiario
{
    private static int qtdeCarros;
    private static double total;

    public void doAdd(Veiculo veiculo)
    {
        BalancoDiario.qtdeCarros = BalancoDiario.qtdeCarros +1;
        BalancoDiario.total += veiculo.doTotal();
    }

    public String doGerarRelatorio()
    {
        return "Total de carros: " + BalancoDiario.qtdeCarros +
                "Total arrecadado: " + BalancoDiario.total;
    }
}
