package mas;

public class Mas {

	public static void main(String[] args) {
		int[] array = new int[] { 5, -4, 10, 25, 54, 0, 15 };
		int[] array1= new int[]{1, 3, 7};
		arrayMax(array);
		arrayMin(array);
		arraySum(array);
		arraySerAr(array);
		merge(array, array1);
		positive(array);
		maxValue(array, array1);

	}

	public static void arrayMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Максимальне значення " + max);
	}

	public static void arrayMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Мінімальне значення " + min);
	}
	
	public static void arraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
			System.out.println("Сума всіх алементів " +sum);
		}
	
	public static void arraySerAr(int[] array){
		int s=0;
		for (int i = 0; i < array.length; i++) {
			s+=array[i];
		}
		System.out.println("Середнє арифметичне " +s/array.length);
	}
//Об'єднання двох масивів	
	public static int[]merge(int[]a, int[]b){
		
        int[] c = new int[ a.length +b.length];
        for (int i=0; i<a.length; i++){
            c[i]=a[i];
        }
        for (int i=a.length, j=0; j<b.length;i++, j++ ){// int a.length недуже зрозуміло
                c[i]=b[j];
              
        }
		  for(int i:c){
		  System.out.print(i+" ");}    	
		return c;// що тут має бути?
		
	}
	//Об'єднання двох масивів та вивід лише додатніх значень	
	public static void positive(int[] array){
		int[] c = new int[array.length];
		System.out.println();
		for (int i=0; i<array.length; i++){
			if(array[i]>=0){
            c[i]=array[i];
			}else continue;
			System.out.print( c[i]+" ");
			}
	
}
	
	public static int[] maxValue(int[] a, int[] b) {
		System.out.println();
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = a.length, j = 0; j < b.length; i++, j++) {// a.length  недуже  зрозуміло																															
			c[i] = b[j];
		}
		int t;
		for (int i = 0; i < c.length; i++)
			for (int j = i + 1; j < c.length; j++)
				if (c[j] > c[i]) {
					t = c[i];
					c[i] = c[j];
					c[j] = t;
				}
		for (int i = 0; i < c.length / 2; i++) {
			System.out.print(c[i] + " ");
		}

		return c;
	}

}
