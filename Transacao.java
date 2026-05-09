public abstract class Transacao {
    protected double valor;

    public Transacao(double valor) {
        this.valor = valor;
    }

    public abstract void aplicar(Conta conta);
}