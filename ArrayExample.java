public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
		float[] randomvalues = {3.14f, 2.718f, 1.414f};
		char[] vowels = {'a','e','i','o','u'};
		double[] productcost = { 7.0, 9.0, 5.0, 1.0, 3.0 };
		short[] elibileage = { 10, 20, 30, 40, 50 };
		long[] population = { 1000000000L, 2000000000L, 3000000000L, 4000000000L };
		boolean[] conditioncheck = {true, false, true, false, false};
		byte[] maxUsers = { 10, 20, 90, 5, 127,};  
		String[] names = {"vaishnavi","saumya","radha"};
		System.out.println("Array length: " + numbers.length);
		System.out.println("Array length: " + randomvalues.length);
		System.out.println("Array length: " + vowels.length);
		System.out.println("Array length: " + productcost.length);
		System.out.println("Array length: " + elibileage.length);
		System.out.println("Array length: " + population.length);
		System.out.println("Array length: " + conditioncheck.length);
		System.out.println("Array length: " + maxUsers.length);
		System.out.println("Array length: " + names.length);
		for (int i = 0; i < numbers.length; i++) {
		System.out.println("Elements are :"  + numbers[i]);
        }
		for (int j = 0; j < randomvalues.length; j++) {
		System.out.println("Elements are :"  +randomvalues[j]);
		}	
		for (int k = 0; k < vowels.length; k++) {
		System.out.println("Elements are :"  +vowels[k]);
		}
		for (int l = 0; l < productcost.length; l++) {
		System.out.println("Elements are :"  +productcost[l]);
		}
		for (int m = 0; m < elibileage.length; m++) {
		System.out.println("Elements are :"  +elibileage[m]);
		}
		for (int n = 0; n < population.length; n++) {
		System.out.println("Elements are :"  +population[n]);
		}
		for (int o = 0; o < conditioncheck.length; o++) {
		System.out.println("Elements are :"  +conditioncheck[o]);
		}
		for (int p = 0; p < maxUsers.length; p++) {
		System.out.println("Elements are :"  +maxUsers[p]);
		}
		for (int q = 0; q < names.length; q++) {
		System.out.println("Elements are :"  +names[q]);
		}
	}
}
