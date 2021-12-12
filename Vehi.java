package practice;
//Interface 

public class Vehi implements I,II {

	@Override
	public void getHondacar() {
		System.out.println("Honda car");
		
	}

	@Override
	public void getTatacar() {
		System.out.println("Tata car");
		
	}
	
	@Override
	public void getSuzuki() {
		System.out.println("Suzuki car");
		
	}
	
	public static void main(String[] args) {
    	Vehi car=new Vehi();
    	car.getTatacar();
    	car.getHondacar();
    	car.getSuzuki();
    	
//    	We call the interface variable by direct dot (.) 
    	System.out.println(I.a);
	}

	
	

}
