package mas;

public class Mas {

	public static void main(String[] args) {
		int[] array = new int[] { 5, -4, 10, 25, 54 };

		arrayMax(array);
		arrayMin(array);

	}

	public static void arrayMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("����������� �������� " + max);
	}

	public static void arrayMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("̳������� �������� " + min);
	}
	
	public static void arraysum(int[] array) {
		int sum;
		for (int i = 0; i < array.length; i++) {
			
		}
	}
}
