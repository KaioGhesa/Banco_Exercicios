package contabanco;



import java.util.Scanner;

public class main {
        public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("Bem vindo ao Banco Ghesa, aperte qualquer botao para entrar: ");
    scanner.nextLine();
    // Recebendo número da conta e nome do titular
    System.out.println("Numero da conta: ");
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); //Consumir a quebra de linha
    System.out.println("Nome do titular: ");
    String nomeTitular = scanner.next();
    scanner.nextLine();
    
    // Criando objeto da classe user
    User cb1 = new User(numeroConta, nomeTitular);
    
    // Mostrando saldo e limite da conta
    System.out.println("Saldo atual: " + cb1.getSaldo());
    System.out.println("Limite atual: " + cb1.getLimite());
    
    // Definir um novo limite
    System.out.println("Digite o novo limite da conta: ");
    double novoLimite = scanner.nextDouble();
    scanner.nextLine();
    cb1.setLimite(novoLimite);
  
    
    // Exibir informações da conta
    cb1.mostrarDados();
    
    // Realizar depósitos
    System.out.println("Digite o numero de depositos a fazer: ");
    int numDepositos = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < numDepositos; i++){
        System.out.println("Digite o valor do deposito " + (i + 1) + ": ");
        double valorDeposito = scanner.nextDouble();
        scanner.nextLine();
        cb1.deposito(valorDeposito);
    }
    
    // Mostrando os dados da conta após depósitos
    cb1.mostrarDados();
    
    // Realizar saques até digitar 0/ usando do/while
    double valorSaque;
    do {
        System.out.println("Digite o valor do saque (ou 0 para sair): ");
        valorSaque = scanner.nextDouble();
        scanner.nextLine();
        if(valorSaque != 0 && valorSaque > 0){
            double valorSacado = cb1.saque(valorSaque);
            System.out.println("Valor sacado: " + valorSacado);
            }
        } while (valorSaque != 0);
            
    
    // Mostrando os dados da conta após os saques com do/while
    cb1.mostrarDados();
    
    // Realizar saques usando while
    while(true) {
        System.out.println("Quanto voce quer sacar (ou 0 para sair): ");
        valorSaque = scanner.nextDouble();
        scanner.nextLine();
        if (valorSaque == 0) {
            break;
        }
        double valorSacado = cb1.saque(valorSaque);
        System.out.println("Valor sacado: " + valorSacado);
      }
    // Exibir informações finais da conta
    cb1.mostrarDados();
    System.out.println("Saldo final: R$ " + cb1.getSaldo());
    
    scanner.close();
    }   
}
