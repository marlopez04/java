package paquete;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cond=true;
		int x=0;
		while(cond){
			System.out.print(" El valor de x es: "+x);
			x = x +2;
			if(x > 8){
				cond = false;				
			}
		}
		

	}

}
