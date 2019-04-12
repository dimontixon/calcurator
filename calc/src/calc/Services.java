package calc;
import java.util.Scanner;
import calc.RomaToArab;

public class Services {
	public static int inputNumber(){
        System.out.print("Input number:");
        String str = null;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        try  
        {  
          num = Integer.parseInt(str); 
          return num;
        }  
        catch(NumberFormatException nfe)  
        {  
            
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
    		if(Character.isLetter(str.charAt(i))){
            	count++;
            }
        }
    	if(count == str.length()) {
    		return num = RomaToArab.romaToArab(str);
    	}
    	else {
    		System.out.println("number error");
    		return 0;
    	}
    }
	
	public static char inputOperation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input operation:");
        char operation = 0;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
        	System.out.println("\n" + "operation error");
        	operation = 0;
        }
        return operation;
	}

	public static int calculation(int num1, int num2, char operation){
        int result = 0;
        switch (operation){
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '+':
                result = num1+num2;
                break;
            default:
                System.out.println("\n" + "incorrectly entered data");
        }
        return result;
    }
}
