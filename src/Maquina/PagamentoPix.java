package Maquina;


public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor, String cliente) {
        super(valor, cliente);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX de R$" + valor + " realizado instantaneamente para " + cliente);
    }
}

