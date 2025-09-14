package Maquina;

// Superclasse abstrata
public abstract class Pagamento {
    protected double valor;
    protected String cliente;

    public Pagamento(double valor, String cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }

    // Método abstrato -> será sobrescrito
    public abstract void processarPagamento();
}
