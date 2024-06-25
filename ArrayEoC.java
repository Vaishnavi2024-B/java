public class ArrayEoC{
	public static void main(String[]args){
	int[] numbers = {10,20,30,60,87};
	  System.out.print("Please enter the number of elements in the array: ");
	int evenCount = 0;
	int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total number of even numbers in this array: " + evenCount);
        System.out.println("Total number of odd numbers in this array: " + oddCount);
    }
}
	
		
				