public class EvenPositionElement {
    int evenPositionElement;
    public void evenPositionElement(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                evenPositionElement = arr[i];
                System.out.println("Even position Element is : " + evenPositionElement);
            }
        }
    }
}
