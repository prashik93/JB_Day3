public class LargestElement {
    public void largestElement(int[] arr) {
        int largest = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Number is : " + largest);
    }
}
