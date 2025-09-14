package Maquina;


public class MaquinaCartao {
    public void realizarPagamento(Pagamento pagamento) {
        System.out.println("Processando pagamento...");
        pagamento.processarPagamento(); // polimorfismo
        System.out.println("----------------------------");
    }
}

