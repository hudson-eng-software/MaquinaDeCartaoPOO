//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Maquina;

public class Main {
    public static void main(String[] args) {
        MaquinaCartao maquina = new MaquinaCartao();

        // Exemplos de pagamento
        Pagamento p1 = new PagamentoCredito(1200.0, "Hudson", 6);
        Pagamento p2 = new PagamentoDebito(300.0, "Maria", 500.0);
        Pagamento p3 = new PagamentoPix(150.0, "João");

        // Processando pagamentos
        maquina.realizarPagamento(p1);
        maquina.realizarPagamento(p2);
        maquina.realizarPagamento(p3);
    }
}
