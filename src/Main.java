
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente roberto = new Cliente();
		roberto.setNome("Roberto");
		
		Conta cc = new ContaCorrente(roberto);
		Conta poupanca = new ContaPoupanca(roberto);
		
		cc.depositar(400);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
