public class Car {

	String color;
	int make;
	String transmission;
	int tyres;
	int doors;
	
	Car(){
		tyres=4;
		doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color :"+color+"\nMake :"+make+"\nTransmission :"+transmission+"\nDoors :"+doors+"\nTyres :"+tyres);
	}
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}
}
