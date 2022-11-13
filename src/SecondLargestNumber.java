public class SecondLargestNumber {
    public void secondLargestNumber(int[] arr) {
        int max = 0;
        int secMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if ((arr[j] > secMax) && (arr[j] < max)) {
                secMax = arr[j];
            }
        }
        System.out.println("Maximum : " + max);
        System.out.println("Second maximum : " + secMax);
    }
}
