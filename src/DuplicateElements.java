public class DuplicateElements {
    public void duplicateElements(int[] arr) {
        int duplicate;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    duplicate = arr[i];
                    System.out.print(duplicate + " ");
                }
            }
        }
    }
}
