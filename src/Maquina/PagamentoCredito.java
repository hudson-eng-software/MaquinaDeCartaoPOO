package Maquina;

public class PagamentoCredito extends Pagamento {
    private int parcelas;

    public PagamentoCredito(double valor, String cliente, int parcelas) {
        super(valor, cliente);
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        double valorParcela = valor / parcelas;
        System.out.println("Pagamento no CRÉDITO aprovado para " + cliente);
        System.out.println("Valor total: R$" + valor + " em " + parcelas + "x de R$" + valorParcela);
    }
}
