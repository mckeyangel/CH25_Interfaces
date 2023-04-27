public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c = new Cuadrado("Cuadrado", 15.0);
		Rectangulo r = new Rectangulo("Rectangulo", 35.0, 12.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(c);
		imprimirCalculo(r);
		
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(FigurasGeometricas f) {
		System.out.println(f);
		System.out.println("+========================================");
		System.out.println("|El área de ["+f.getName()+"] es: " + f.calcularArea() + 
				"\n" + "|El perímetro de ["+f.getName()+"] es: " + f.calcularPerimetro());
		System.out.println("+========================================\n");
	}//imprimirCalculo
}//class testFiguras