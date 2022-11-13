public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        PrintElementsOfArray eleObj = new PrintElementsOfArray();
        eleObj.elementsOfArray(arr);

        int[] arr2 = {1,1,3,2,2,3,4,5,6,5,7,8,7};
        FrequencyOfEachElements freObj = new FrequencyOfEachElements();
        freObj.frequencyOfEachElements(arr2);

        int[] arr3 = {25,24,33,14,5,28};
        LargestElement larObj = new LargestElement();
        larObj.largestElement(arr3);
    }
}