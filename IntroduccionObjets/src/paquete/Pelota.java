package paquete;

public class Pelota {
	float radio;
	float peso;
	
	public Pelota(){
		
		radio = 100;
		peso = 250;
	}
	
	public Pelota(float radio, float peso){
		this.radio=radio;
		this.peso=peso;
	}
	
	public float obtenerRadio(){
		
		return radio;
	}
	
	public float obtenerPeso(){
		
		return peso;
	}

}
