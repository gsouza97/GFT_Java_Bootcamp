package app;

import model.Cliente;
import model.Endereco;

public class EntregaCartaoApp {
    public static void main(String[] args) throws Exception {

        Endereco endereco = new Endereco();
        endereco.cep = "000000";

        Cliente cliente = new Cliente();

        try {
            cliente.adicionarEndereco(endereco);
            System.out.println("Adicionado");
        } catch (Exception excep) {
            System.err.println("Houve um erro ao adicionar o endereço: " + excep.getMessage());
        }

    }
}
