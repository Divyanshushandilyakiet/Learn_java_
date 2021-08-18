//Overriding (Rate of interest in banks)
package corejava;

class Banks{
	int getRateOfIntrest(){return 0;}
}

class ICICI extends Banks{	
	int getRateOfIntrest(){return 8;}	
}

class SBI extends Banks{
	int getRateOfIntrest(){return 7;}	
}

class AXIS extends Banks{
	int getRateOfIntrest(){return 9;}	
}


public class TestOverriding {
  public static void main(String[] args) {
	ICICI i =new ICICI();
	SBI s=new SBI();
	AXIS a=new AXIS();
	System.out.println("ICICI rate of interest is "+i.getRateOfIntrest());
	System.out.println("SBI rate of interest is "+s.getRateOfIntrest());
	System.out.println("AXIS rate of interest is "+a.getRateOfIntrest());
}
}
