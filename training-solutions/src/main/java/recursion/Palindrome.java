package recursion;

public class Palindrome {
    public boolean isPalindrome(String word){
        int length=word.length();
        if(length<=1){
            return true;
        }
        else{
            return (word.charAt(0)==word.charAt(length-1) && isPalindrome(word.substring(1,length-1)));
        }
    }
}
