package converter;

import javax.swing.JOptionPane;

public class Converter {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Type a number");
		String base = JOptionPane.showInputDialog("Type an appropriate base");

		int baseInt = Integer.parseInt(base);
		int answer;

		try {

			answer = Integer.valueOf(num, baseInt);

			System.out.println("Decimal:" + answer);
			System.out.println("Binary: " + Integer.toBinaryString(answer));
			System.out.println("Octal: " + Integer.toOctalString(answer));
			System.out.println("Hexagonal: " + Integer.toHexString(answer));

		} catch (NumberFormatException e) {
			System.out.println("Type the appropriate type of number and base");
		}

	}

}
