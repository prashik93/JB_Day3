public class FrequencyOfEachElements {
    public void frequencyOfEachElements (int[] arr2) {
        int[] alreadyCountArray = new int[arr2.length];
        int alreadyCount = -1;
        for(int i = 0; i < arr2.length; i++) {
            int temp = 1;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]) {
                    temp++;
                    alreadyCountArray[j] = alreadyCount;
                }
                if(alreadyCountArray[i] != alreadyCount) {
                    alreadyCountArray[i] = temp;
                }
            }
        }
        for(int i = 0; i < alreadyCountArray.length; i++) {
            if(alreadyCountArray[i] != alreadyCount) {
                System.out.println(arr2[i] + " --> " + alreadyCountArray[i]);
            }
        }
    }
}
