package Class08;

public class TaskDigitalClass {

	public static void main(String[] args) {

		String time = null;

		for (int a = 1; a <= 23; a++) {

			for (int b = 1; b <= 59; b++) {
				if (a < 10 && b < 10) {
					time = "0" + a + ":" + "0" + b;
				} else if (a < 10 && b >= 10) {
					time = "0" + a + ":" + b;
				} else if (a >= 10 && b < 10) {
					time = a + ":" + "0" + b;
				} else {
					time = a + ":" + b;
				}
				System.out.println(time);
			}

		}

	}
}
