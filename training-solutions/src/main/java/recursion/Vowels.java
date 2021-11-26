package recursion;

public class Vowels {
    private String vowelsArray="aáeéiíoóöőuúüű";
    public int getNumberOfVowels(String word){
        int length=word.length();
        if(length==0){
            return 0;
        }
        else{
            if(vowelsArray.indexOf(word.toLowerCase().charAt(0))>-1){
                return 1+getNumberOfVowels(word.substring(1));
            }
            else{
                return getNumberOfVowels(word.substring(1));
            }
        }
    }
}
