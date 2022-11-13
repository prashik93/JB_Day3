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

        int[] arr4 = {-1,5,0,8,34};
        SmallestElement smaObj = new SmallestElement();
        smaObj.smallestElement(arr4);

        int[] arr5 = {1,2,4,4,5,6,10,8,9};
        EvenPositionElement evenObj = new EvenPositionElement();
        evenObj.evenPositionElement(arr5);

        int[] arr6 = {1,2,3,4,10,6,7,8,9};
        ReverseElementsOfArray revObj = new ReverseElementsOfArray();
        revObj.reverseElementsOfArray(arr6);
    }
}