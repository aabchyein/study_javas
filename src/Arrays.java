public class Arrays {
    public String[] initialArrays() {
        String[] carTypes = {"volvo", "BMW", "Ford", "Mazda"};
        return carTypes;
    }

    // public static void main(String[] args) {
        // String[][] numbers = {{"10", "20","30", "40"},{"50", "60", "70"}};
        // for (int second=0; second < numbers.length; second = second +1) {
        //     for (int third=0; third < numbers[second].length; third = third + 1) {
        //         System.out.print(numbers[second][third] + ",");
        //     }
        //     System.out.println();
        // }
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();
        System.out.println(cars.length);
        for (int first=0; first < cars.length; first = first + 1) {
            System.out.print(cars[first]+",");
        }
        System.out.println();
        // return 0;
    }
    
}
