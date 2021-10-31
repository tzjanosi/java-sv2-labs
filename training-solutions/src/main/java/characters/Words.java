package characters;

import java.util.Scanner;

public class Words {
    private String word;
    private String studentWord;

    public Words(String word, String studentWord) {
        this.word = word;
        this.studentWord = studentWord;
    }

    public void analysis(){
        String output="";
        int studentWordlength=studentWord.length();
        for(int i=0; i<studentWordlength;i++){
            output+=studentWord.charAt(i);
            if(i<studentWordlength-1){
                output+=" - ";
            }
        }
        System.out.println(output);
        if(word.equals(studentWord)){
            System.out.println("You have spelt correctly.");
        }
        else{
            System.out.println("You have NOT spelt correctly.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teacher, type in a word:");
        String word=scanner.nextLine();
        System.out.println("Student, spell the word: '"+word+"'");
        String studentWord=scanner.nextLine();
        Words words=new Words(word, studentWord);
        words.analysis();
    }
}
