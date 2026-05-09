public class Despesa extends Transacao {
    public Despesa(double valor) {
        super(valor);
    }

    @Override
    public void aplicar(Conta conta) {
        conta.sacar(valor);
    }
}