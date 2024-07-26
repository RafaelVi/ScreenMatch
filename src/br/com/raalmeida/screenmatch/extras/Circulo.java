package br.com.raalmeida.screenmatch.extras;

public class Circulo implements Forma{
    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * (raio * raio);
        System.out.println("Área do Circulo:" + Math.round(area));
    }
}
