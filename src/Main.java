import Prog1Tools.IOTools;

public class Main {

	public static void main(String[] args) {
		
		int umsatz_aktuell, umsatz_bisher, rabatt;
		umsatz_aktuell = IOTools.readInteger("Geben Sie Ihren aktuellen Umsatz ein: ");
		umsatz_bisher = IOTools.readInteger("Geben Sie Ihren bisherigen Umsatz ein: ");
		rabatt = 0;
		
		if (umsatz_aktuell <= 100 && umsatz_bisher <= 500) {
			
		} else if (umsatz_aktuell <= 100 && umsatz_bisher > 500) {
			rabatt = 2;
		} else if (umsatz_aktuell > 100 && umsatz_aktuell <= 1000 && umsatz_bisher >= 500 && umsatz_bisher <= 1000) {
			rabatt = 3;
		} else if (umsatz_aktuell > 100 && umsatz_aktuell <= 1000 && umsatz_bisher > 1000) {
			rabatt = 4;
		} else if (umsatz_aktuell > 1000 && umsatz_aktuell <= 5000 && umsatz_bisher > 1000 && umsatz_bisher <= 2500) {
			rabatt = 5;
		} else if (umsatz_aktuell > 1000 && umsatz_aktuell <= 5000 && umsatz_bisher > 2500) {
			rabatt = 6;
		} else if (umsatz_aktuell > 5000) {
			rabatt = 7;
		}
		
// Funktioniert nicht
		
//		if (umsatz_aktuell <= 100 && umsatz_bisher <= 500) {
//			
//		} else if (umsatz_aktuell <= 100 && umsatz_bisher > 500) {
//			rabatt = 2;
//		} else if (umsatz_aktuell <= 1000 && umsatz_bisher <= 1000) {
//			rabatt = 3;
//		} else if (umsatz_aktuell <= 1000 && umsatz_bisher > 1000) {
//			rabatt = 4;
//		} else if (umsatz_aktuell <= 5000 && umsatz_bisher <= 2500) {
//			rabatt = 5;
//		} else if (umsatz_aktuell <= 5000 && umsatz_bisher > 2500) {
//			rabatt = 6;
//		} else if (umsatz_aktuell > 5000) {
//			rabatt = 7;
//		}
		
		System.out.println("Ihr Rabatt beträgt: " + rabatt);
		
	}

}
