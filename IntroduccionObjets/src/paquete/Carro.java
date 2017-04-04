package paquete;

public class Carro {
	
	double peso;
	double altura;
	double ancho;
	double largo;
	int numeroPuertas;
	boolean encendido=false;
	String modelo;
	
	public Carro(){
		this.peso = 1000;
		this.altura = 1.90;
		this.ancho = 4;
	}
	
	public double obtenerPeso(){
		return this.peso;
	}
	
	public void encender(){
		this.encendido = true;
		System.out.println("El carro esta encendido");
	}
	
	public void apagar(){
		this.encendido = false;
		System.out.println("el carro esta apagado");
	}
	
	public void estado(){
		if(this.encendido == true){
			System.out.println("el carro esta encendido");
		}else{
			System.out.println("el carro esta apagado");
		}
		
	}
	
//inicio polimorfismo (implica que en una clase y en sus hijos
//pueden tener la misma funcion pero con diferentes contenidos
//o acciones, pero sigue siendo la misma funcion.
	
	public void informacion(){
		System.out.println("Este es un carro comun");
	}

//fin polimorfismo
	
}

//inicio herencia
//CarroBMW con el termino extends asociando con la clase carro, hereda
//todas las propiedades del padre Carro, pero se le cambia en este caso el modelo
class CarroBMW extends Carro {
	public CarroBMW(){
		this.modelo="BMW";
	}
	
	public void turbo(){
		System.out.println("Acabas de viajar a 100 millas por hora");
	}

//inicio polimorfismo	
	public void informacion(){
		System.out.println("Este es un carro BMW del año 2011");
	}
//fin polimorfismo
}

class CarroToyota extends Carro {
	public CarroToyota(){
		modelo = "Toyota";
	}
	
	public String modelo(){
		return this.modelo;
	}

//inicio polimorfismo
	public void informacion(){
		System.out.println("Este es un carro Toyota 2010");
	}
//fin polimorfismo
}

//fin herencia
