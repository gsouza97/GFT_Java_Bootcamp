public class App {
    public static void main(String[] args) throws Exception {

        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel");

        Conta cc = new ContaCorrente(gabriel);
        Conta cp = new ContaPoupanca(gabriel);

        cc.depositar(100);
        cc.transferir(cp, 100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
