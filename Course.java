public class Course {
    public static void main(String[] args) {
        float originalCost = 12000; 
        float gstPercentage = 18; 
        float gstAmount = (originalCost * gstPercentage) / 100;

        float totalFee = originalCost + gstAmount;

        System.out.println("Original Course Cost: Rs " + originalCost);
        System.out.println("GST Amount: Rs " + gstAmount);
        System.out.println("Total Fee (including GST): Rs " + totalFee);
    }
}