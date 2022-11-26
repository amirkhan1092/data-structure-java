public class SumArray {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        // int total = 0;

        // add each element's value to total
        // for (int counter = 0; counter < array.length; counter++)
        //     total += array[counter];

        // System.out.printf("Total of array elements: %d%n", total);

        // For-each Loop for Java Array
        int totalForEach = 0;
        for (int number : array)
            totalForEach += number;
        System.out.println("Total of array elements using for-each loop: " + totalForEach);
    }
}
