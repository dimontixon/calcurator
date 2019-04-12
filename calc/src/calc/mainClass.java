package calc;
import calc.RomaToArab;
import calc.Services;
public class mainClass {

	
	
	public static void main(String[] args) {
		int a = Services.inputNumber();
		char operation = Services.inputOperation();
		int b = Services.inputNumber();
		/* ----------- Test output --------------
		 * System.out.println("A = "+ a);
		System.out.println("B = "+ b);
		System.out.println("op = "+ operation);*/
		System.out.println(Services.calculation(a, b, operation));
	}

}
