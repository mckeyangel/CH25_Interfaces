
public class Trapecio implements FigurasGeometricas{
	private String name;
	private double baseMenor;
	private double baseMayor;
	private double altura;
	private double lado1;
	private double lado2;
	public Trapecio(String name, double baseMenor, double baseMayor, double altura, double lado1, double lado2) {
		this.name = name;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}//Constructor
	
	public double calcularArea() {
		return ( getAltura() * (getBaseMayor() + getBaseMenor()) )/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado1() + getLado2() + getBaseMayor() + getBaseMenor());
	}// calcularPerimetro

	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getBaseMenor() {
		return baseMenor;
	}//getBaseMenor

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}//setBaseMenor

	public double getBaseMayor() {
		return baseMayor;
	}//getBaseMayor

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}//setBaseMayor

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura

	public double getLado1() {
		return lado1;
	}//getLado1

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}//setLado1

	public double getLado2() {
		return lado2;
	}//getLado2

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}//setLado2

	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", altura=" + altura
				+ ", lado1=" + lado1 + ", lado2=" + lado2 ;
	}//toString

}//class Trapecio
