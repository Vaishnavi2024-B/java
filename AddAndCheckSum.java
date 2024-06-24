public class AddAndCheckSum {
     
    static int firstNumber = 10; 
    static int secondNumber = 20; 
	public static void main(String[] args) {
        int sum = firstNumber + secondNumber;

        if (sum == firstNumber) {
            System.out.println("Sum is equal to the first number.");
        } else {
            System.out.println("Sum is not equal to the first number.");
        }
    }
    
}
