package model;

public class App {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());

        Carro carro2 = new Carro("cinza", "Benz Classe C", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorParaEncher(6.99));

    }
}
