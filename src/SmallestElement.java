public class SmallestElement {
    public void smallestElement(int[] arr) {
        int smallest = 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
    }
}
