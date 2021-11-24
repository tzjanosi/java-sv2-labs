package algorithmscount.height;


import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heightOfChildren,int heightLimit){
        int numberOfChildrenWithHeightGreaterThan=0;
        for(int height:heightOfChildren){
            if(height>heightLimit){
                numberOfChildrenWithHeightGreaterThan++;
            }
        }
        return numberOfChildrenWithHeightGreaterThan;
    }
}
