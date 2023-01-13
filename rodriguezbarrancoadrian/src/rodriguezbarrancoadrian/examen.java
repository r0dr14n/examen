package rodriguezbarrancoadrian;


public class examen {

	public static void mostrar_imcs (double matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
				System.out.print("\n");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
		System.out.print("\n");
	}
	
	
	public static double media_paciente (double matriz[][], int p) {
		double resultado = 0;
		for (int i = 0; i < matriz.length; i++) {
			if (p==i) {
				for (int j = 0; j < matriz[0].length; j++) {
					resultado = matriz[i][j] + resultado;
				}
			}
		}
		resultado = resultado/matriz[0].length;
		return resultado;
	}
	
	
	
}
