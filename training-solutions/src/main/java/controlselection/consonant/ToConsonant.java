package controlselection.consonant;

public class ToConsonant {
    public boolean isConsonant(char ch){
        char lowerCaseChar = Character.toLowerCase(ch);
        if(lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u' ) {
            return false;
        }
        return true;
    }
    public char convertToConsonant(char c){
        if(isConsonant(c)){
            return c;
        }
        char newChar=c+=1;
        return newChar;
    }
}
