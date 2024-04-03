package n1exercici2;

public class CalculoDni {
	
	public static String calculoDni(int dni) {
		int resto = dni   % 23; 
		String ans = "";
        switch (resto) {
            case 0:
                ans = "T";
                break;
            case 1:
                ans = "R";
                break;
            case 2:
                ans = "W";
                break;
            case 3:
                ans = "A";
                break;
            case 4:
                ans = "G";
                break;
            case 5:
                ans = "M";
                break;
            case 6:
                ans = "Y";
                break;
            case 7:
                ans = "F";
                break;
            case 8:
                ans = "P";
                break;
            case 9:
                ans = "D";
                break;
            case 10:
                ans = "X";
                break;
            case 11:
                ans = "B";
                break;
            case 12:
                ans = "N";
                break;
            case 13:
                ans = "J";
                break;
            case 14:
                ans = "Z";
                break;
            case 15:
                ans = "S";
                break;
            case 16:
                ans = "Q";
                break;
            case 17:
                ans = "V";
                break;
            case 18:
                ans = "H";
                break;
            case 19:
                ans = "L";
                break;
            case 20:
                ans = "C";
                break;
            case 21:
                ans = "K";
                break;
            case 22:
                ans = "E";
                break;
        }
        return ans;
	}

}
