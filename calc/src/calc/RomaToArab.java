package calc;

public class RomaToArab {
	private static int romaLetters(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
	
	public static int romaToArab(String value) {
        int result = 0;
        String roma = value.toUpperCase(); 
        for (int i = 0; i < roma.length() - 1; i++) {
            if (romaLetters(roma.charAt(i)) < romaLetters(roma.charAt(i + 1))) {
                result -= romaLetters(roma.charAt(i));
            } else {
                result += romaLetters(roma.charAt(i));
            }
        }
        result += romaLetters(roma.charAt(roma.length() - 1));
        return result;
    }
}
