package Maquina;

public class PagamentoDebito extends Pagamento {
    private double saldoConta;

    public PagamentoDebito(double valor, String cliente, double saldoConta) {
        super(valor, cliente);
        this.saldoConta = saldoConta;
    }

    @Override
    public void processarPagamento() {
        if (saldoConta >= valor) {
            saldoConta -= valor;
            System.out.println("Pagamento no DÉBITO aprovado para " + cliente);
            System.out.println("Novo saldo: R$" + saldoConta);
        } else {
            System.out.println("Pagamento no DÉBITO recusado: saldo insuficiente.");
        }
    }
}

