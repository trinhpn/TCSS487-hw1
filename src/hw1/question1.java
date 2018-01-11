package hw1;

public class question1 {

	public static void main(String[] args) {
		StringBuilder cipher = new StringBuilder("JGRMQOYGHMVBJWRWQFPWHGFFDQGFPFZRKBEEBJIZQQOCIBZKLFAFGQVFZFWWEOGWOPFGFHWOLPHLRLOLFDMFGQWBLWBWQOLKFWBYLBLYLFSFLJGRMQBOLWJVFPFWQVHQWFFPQOQVFPQOCFPOGFWFJIGFQVHLHLROQVFGWJVFPFOLFHGQVQVFILEOGQILHQFQGIQVVOSFAFGBWQVHQWIJVWJVFPFWHGFIWIHZZRQGBABHZQOCGFHX");
		replaceChar(cipher);
		System.err.print(cipher);
	}
	
	private static void replaceChar(StringBuilder text) {
		for (int i = 0; i < text.length(); i++) {
			char temp = text.charAt(i);
			switch(temp) {
			case 'F':
				text.setCharAt(i, 'E');
				break;
			}
			
				
		}
	}
}
