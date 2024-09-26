public class TesteEstacionamento {
    public static void main(String[] args) {
        Segurado veicSeg = new Segurado(10);
        veicSeg.setValorHora(5);
        veicSeg.setValorAdicional(2);
        veicSeg.setHoras(0);

        Segurado veicSeg2 = new Segurado(10);
        veicSeg2.setValorHora(5);
        veicSeg2.setValorAdicional(2);
        veicSeg2.setHoras(0);

        //System.out.println(veicSeg.doViewCupom());

        BalancoDiario bd = new BalancoDiario();
        bd.doAdd(veicSeg);
        bd.doAdd(veicSeg2);
        System.out.println(bd.doGerarRelatorio());
    }
}