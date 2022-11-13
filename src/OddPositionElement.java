public class OddPositionElement {
    public void oddPositionElement(int[] arr) {
        int oddPositionElement;
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 != 0) {
                oddPositionElement = arr[i];
                System.out.println("Odd position element is : " + oddPositionElement);
            }
        }
    }
}
