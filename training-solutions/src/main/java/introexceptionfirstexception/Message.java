package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {
    public static void main(String[] args) {
        Message message = new Message();
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        message.soutCodedMessage(codedMessage);
        //List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "1O1", "110", "101", "116", "46");
        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "101", "110", "101", "116", "46");
        message.soutCodedMessage(anotherCodedMessage);
        System.out.println("1O1 nem szám, ezt 101-re javítva lefutott.");
    }

    private void soutCodedMessage(List<String> codedMessage) {
        StringBuilder sb = new StringBuilder();
        /*
        for(int i=0;i<codedMessage.size(); i++){
            sb.append(convertStringToChar(codedMessage.get(i)));
        }
        */
        for(String cMessage:codedMessage){
            sb.append(convertStringToChar(cMessage));
        }

        System.out.println(sb);
    }

    private char convertStringToChar(String s) {
        int i=Integer.parseInt(s);
        char c=(char) i;
        return c;
    }
}
