import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SistemaFinanceiro sistema = new SistemaFinanceiro();

        Usuario user = new Usuario("João", 2000);
        Conta conta = new ContaCorrente();

        int opcao;

        do {

            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Ver Histórico");
            System.out.println("0 - Sair");

            try {

                opcao = sc.nextInt();

            } catch (Exception e) {

                System.out.println("Digite um número válido!");
                sc.nextLine();
                opcao = -1;
            }

            switch (opcao) {

                case 1:

                    try {

                        System.out.print("Valor: ");

                        double valorDep = sc.nextDouble();

                        new Receita(valorDep).aplicar(conta);

                        sistema.adicionarHistorico(
                                "Depósito de R$ " + valorDep
                        );

                        System.out.println("Depósito realizado!");

                    } catch (Exception e) {

                        System.out.println("Valor inválido!");
                        sc.nextLine();
                    }

                    break;

                case 2:

                    try {

                        System.out.print("Valor: ");

                        double valorSaq = sc.nextDouble();

                        new Despesa(valorSaq).aplicar(conta);

                        sistema.adicionarHistorico(
                                "Saque de R$ " + valorSaq
                        );

                        System.out.println("Saque realizado!");

                    } catch (Exception e) {

                        System.out.println("Valor inválido!");
                        sc.nextLine();
                    }

                    break;

                case 3:

                    System.out.println("Saldo: " + conta.getSaldo());

                    break;

                case 4:

                    sistema.listarHistorico();

                    break;

                case 0:

                    System.out.println("Encerrando sistema...");

                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}