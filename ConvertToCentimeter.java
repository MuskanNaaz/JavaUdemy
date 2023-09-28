
public class ConvertToCentimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Centimeter = " + totalHeight(5));
		System.out.println("Centimeter = " + totalHeight(6,5));

	}

	public static double totalHeight(int inches) {
		double centi = (double)inches * 2.54;
		System.out.println(centi);
		return centi;
		// return inches * 2.54;

	}
	public static double totalHeight(int feet, int inches) {
		double inche = (double)feet*12;
		System.out.println(inche);
		double totalInch = inche + inches;
		double centi = (double)totalInch * 2.54;
		return centi;
		// return ((feet*12) + inches)*2.54;

	}

}
