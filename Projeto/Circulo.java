package Projeto;

public class Circulo extends FiguraGeometrica {
    private double raio;
    public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
    @Override
    public double getArea() {
        return Math.PI*(raio*raio);
    }
    @Override
    public String getDescricao() {
        return " Raio do Circulo: " + raio;
    }
       
}
