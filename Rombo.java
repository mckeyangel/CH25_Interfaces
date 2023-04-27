
public class Rombo {
	
	private String name;
	private double dMenor;
	private double dMayor;
	private double lado;
	public Rombo(String name, double dMenor, double dMayor, double lado) {
		this.name = name;
		this.dMenor = dMenor;
		this.dMayor = dMayor;
		this.lado = lado;
	}//Constructor
	
	public double calcularArea() {
		return (getdMayor() * getdMenor())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado()*4);
	}// calcularPerimetro

	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getdMenor() {
		return dMenor;
	}//getdMenor

	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}//setdMenor

	public double getdMayor() {
		return dMayor;
	}//getdMayor

	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}//setdMayor

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	@Override
	public String toString() {
		return "Rombo [name=" + name + ", dMenor=" + dMenor + ", dMayor=" + dMayor + ", lado=" + lado + "]";
	}//toString

}//class Rombo
