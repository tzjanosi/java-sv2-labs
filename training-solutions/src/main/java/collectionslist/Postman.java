package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class Postman {
    private List<String> addressList=new LinkedList<>();

    public void addAddress(String address){
        if(address==null){
            throw new NullPointerException("Address mustn't be null!");
        }
        addressList.add(address);
    }
    public void removeAddress(String address){
        if(address==null){
            throw new NullPointerException("Address mustn't be null!");
        }
        addressList.remove(addressList.indexOf(address));
    }

    public List<String> getAddresses() {
        return addressList;
    }
}
