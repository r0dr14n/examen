package rodriguezbarrancoadrian;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Índice de masa corporal");
		
		System.out.println("Introduce la altura (en metros)");
		double altura = teclado.nextDouble();
		
		System.out.println("Introduce el peso (en kg)");
		double peso = teclado.nextDouble();
		
		
		double imc = peso/(altura*altura);
		
		
		if (18.5>imc) {
			System.out.println("El paciente de "+peso+" kg y "+altura+" "
					+ "metros tiene un IMC de "+imc+" y tiene un diagnostico de :");
			System.out.println("Bajo peso");
		}
		else if (18.5<=imc && 24.9>=imc) {
			System.out.println("El paciente de "+peso+" kg y "+altura+" "
					+ "metros tiene un IMC de "+imc+" y tiene un diagnostico de :");
			System.out.println("Peso normal (saludable)");
		}
		else if (25<=imc && 29.9>=imc) {
			System.out.println("El paciente de "+peso+" kg y "+altura+" "
					+ "metros tiene un IMC de "+imc+" y tiene un diagnostico de :");
			System.out.println("Sobrepeso");
		}
		else if (30<=imc && 40>=imc) {
			System.out.println("El paciente de "+peso+" kg y "+altura+" "
					+ "metros tiene un IMC de "+imc+" y tiene un diagnostico de :");
			System.out.println("Obesidad premórbida");
		}
		else if (40<imc) {
			System.out.println("El paciente de "+peso+" kg y "+altura+" "
					+ "metros tiene un IMC de "+imc+" y tiene un diagnostico de :");
			System.out.println("Obesidad mórbida");
		}
		
		
		
		
		
	}

}
