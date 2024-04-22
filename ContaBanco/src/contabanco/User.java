package contabanco;

public class User {
    
    private String nome;
    private int numero;
    private double saldo;
    private double limite;
    
// Construtor para criar uma conta com número e nome do titular
    public User(int numero, String nome) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0.0;
        this.limite = 0.0;
     }
     
// Getters e setters    
        public double getSaldo() {
            return saldo;
        }
        
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        
        public double getLimite() {
            return limite;
        }
        
        public void setLimite(double limite) {
            this.limite = limite;
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public int getNumero() {
            return numero;
        }
        
        public void setNumero(int numero){
            this.numero = numero;
        }

// Metódo para exibir informações da conta
    public void mostrarDados(){
        System.out.println("Numero da conta: " + numero);
        System.out.println("Titular: " + nome);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);
    }
    
// Metódo para realizar depósito  
    public void deposito(double valor){
            saldo += valor;
    }    
    
// Metódo para realizar saque 
    public double saque (double valor){
        if (saldo + limite >= valor){
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente para o saque. ");
            return 0;
        }
    }
}