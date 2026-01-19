import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        // Dados
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = leitura.nextLine();

        String tipoConta = "Corrente";
        double saldo = 0.0;
        int opcao = 0;

        // Tela Inicia
        System.out.println("*****************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************");

        String menu = """
                ** Digite sua opção **
                1- Consultar Saldo
                2- Transferir valor
                3- Receber Valor
                4- Sair
                
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("Saldo Atual é " + saldo);
            }
            else if (opcao == 2){
                System.out.println("Qual valor que deseja transferir");
                double valor = leitura.nextDouble();

                if (valor > saldo){
                    System.out.println("Não há Saldo Suficiente");
                }
                else {
                    saldo -=  valor;
                    System.out.println("Novo Saldo: " + saldo);
                }
            }
            else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo: " + saldo);
                
            } else if (opcao == 4) {
                System.out.println("Opção Inválida");

            }

        }

    }
}