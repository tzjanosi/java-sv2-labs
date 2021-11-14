package meetingrooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {
    List<MeetingRoom> meetingRooms = new ArrayList<>();


    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
        System.out.println("Hozzáadva: "+meetingRoom.toString());
    }
    public void printNames(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < meetingRooms.size(); i++) {
            sb.append(meetingRooms.get(i).getName());
            if (i != (meetingRooms.size() - 1)) {
                sb.append(", ");
            }
        }
        System.out.println("Tárgyalók beviteli sorrendben: "+sb);
    }
    public void printNamesReverse(){
        StringBuilder sb = new StringBuilder();
        for (int i = meetingRooms.size()-1; i >=0 ; i--) {
            sb.append(meetingRooms.get(i).getName());
            if (i >0) {
                sb.append(", ");
            }
        }
        System.out.println("Tárgyalók visszafele sorrendben: "+sb);
    }
    public void printEvenNames(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < meetingRooms.size(); i++) {
            if(i%2==0){
                sb.append(meetingRooms.get(i).getName());
            }
            if (i < (meetingRooms.size() - 2)) {
                sb.append(", ");
            }
        }
        System.out.println("Minden második tárgyaló: "+sb);
    }
    public void printAreas(){
        int[] areas = new int[meetingRooms.size()];
        for (int i = 0; i < meetingRooms.size(); i++) {
            areas[i]=meetingRooms.get(i).getArea();
        }
        System.out.println("Tárgyalók területe: "+ Arrays.toString(areas));
    }
    public void printMeetingRoomsWithName(String name){
        for(MeetingRoom meetingRoom:meetingRooms){
            if(name.equals(meetingRoom.getName())){
                System.out.println(meetingRoom);
            }
        }
    }
    public void printMeetingRoomsContains(String part){
        for(MeetingRoom meetingRoom:meetingRooms){
            if(meetingRoom.getName().contains(part)){
                System.out.println(meetingRoom);
            }
        }
    }
    public void printAreasLargerThan(int area){
        for(MeetingRoom meetingRoom:meetingRooms){
            if(meetingRoom.getArea()>area){
                System.out.println(meetingRoom);
            }
        }
    }
}
