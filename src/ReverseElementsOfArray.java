public class ReverseElementsOfArray {
    public void reverseElementsOfArray(int[] arr) {
        int len = arr.length -1;
        for(int i = len; i >= 0;  i = i - 1) {
            System.out.print(arr[i] + " ");
        }
    }
}
