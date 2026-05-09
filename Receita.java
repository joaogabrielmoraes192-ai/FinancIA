public class Receita extends Transacao {
    public Receita(double valor) {
        super(valor);
    }

    @Override
    public void aplicar(Conta conta) {
        conta.depositar(valor);
    }
}