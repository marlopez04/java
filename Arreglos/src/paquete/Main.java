package paquete;

class Main {

	public static void main(String[] args) {
		
		int x[] = {10,5,7};
		
		/*
		int x[];
		x = new int[3];
		
		x[0] = 10;
		x[1] = 5;
		x[2] = 7;
		*/
		
		for(int i=0;i<x.length;i++){
			System.out.println("Arreglo en indice: " +i+ "es igual a: " +x[i]);
		}

	}

}
