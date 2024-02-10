package pr1;

public class ea {
	
	
	 int CalculateExponent(int base,int exp) {
		if(exp==0) {
			return 1;
		}
		else {
			return base*CalculateExponent(base,exp-1);
		}
		
		}
		
	 void display() {
			
			System.out.println(" jhfy ");
	}

}
