package model;

// Classe de exemplo
class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtor aqui
    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // gets e sets
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    // get e set tanque
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // Método do total para encher o tanque
    public double valorParaEncher(double precoCombustivel) {
        return capacidadeTanque * precoCombustivel;
    }

}