package searching;

import java.util.Arrays;

public class Mountain {
    private int[] heightsArray;

    public Mountain(int[] heightsArray) {
        this.heightsArray = heightsArray;
        Arrays.sort(this.heightsArray);
    }

    public boolean searchPike(Pike pike){
        int index=Arrays.binarySearch(heightsArray,pike.getHeight());
        return index>=0;
    }
}
