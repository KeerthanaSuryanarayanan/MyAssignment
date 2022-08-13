package assignment;

public class Bike {
	
	public void Raisegear() {
		
		System.out.println("Raise thr gear");
	}
	public static void main(String[] args) {
		Car start=new Car();
		start.applybreak();
		start.soundhorn();
		Bike go=new Bike();
		go.Raisegear();
	}

}
