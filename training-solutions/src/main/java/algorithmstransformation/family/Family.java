package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> familyMemberList;

    public Family() {
        this.familyMemberList = new ArrayList<>();
    }
    public void addFamilyMember(FamilyMember familyMember){
        familyMemberList.add(familyMember);
    }
    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String nameToCheck){
        List<Integer> agesOfFamilyMembersWithNameGiven=new ArrayList<>();
        for(FamilyMember familyMember:familyMemberList){
            if(familyMember.getName().contains(nameToCheck)){
                agesOfFamilyMembersWithNameGiven.add(familyMember.getAge());
            }
        }
        return agesOfFamilyMembersWithNameGiven;
    }
}
