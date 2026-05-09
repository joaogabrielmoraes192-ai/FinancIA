import java.util.ArrayList;

public class SistemaFinanceiro {

    private ArrayList<String> historico = new ArrayList<>();

    public void adicionarHistorico(String operacao) {
        historico.add(operacao);
    }

    public void listarHistorico() {

        System.out.println("\n=== HISTÓRICO ===");

        for(String item : historico) {
            System.out.println(item);
        }
    }
}