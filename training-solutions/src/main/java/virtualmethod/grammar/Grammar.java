package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb verb1=new PhrasalVerb("fut","el");
        Verb verb2=new PhrasalVerbWithSuffix("fut","el","toldalék");
        Preposition preposition1=new PhrasalVerb("fut","el");
        Preposition preposition2=new PhrasalVerbWithSuffix("fut","el","toldalék");
        PhrasalVerb phrasalVerb1=new PhrasalVerb("fut","el");
        PhrasalVerb phrasalVerb2=new PhrasalVerbWithSuffix("fut","el","toldalék");
        Suffix suffix=new PhrasalVerbWithSuffix("fut","el","toldalék");
        PhrasalVerbWithSuffix phrasalVerbWithSuffix=new PhrasalVerbWithSuffix("fut","el","toldalék");
        System.out.println("word: "+verb1.getWord());
        System.out.println("word: "+verb2.getWord());
        System.out.println("preposition: "+preposition1.getPreposition()+", the whole word: "+preposition1.getWholeWord());
        System.out.println("preposition: "+preposition2.getPreposition()+", the whole word: "+preposition2.getWholeWord());
        System.out.println("preposition: "+phrasalVerb1.getPreposition()+", word: "+phrasalVerb1.getWord()+", the whole word: "+phrasalVerb1.getWholeWord());
        System.out.println("preposition: "+phrasalVerb2.getPreposition()+", word: "+phrasalVerb2.getWord()+", the whole word: "+phrasalVerb2.getWholeWord());
        System.out.println("suffix: "+suffix.getSuffix());
        System.out.println("preposition: "+phrasalVerbWithSuffix.getPreposition()+", word: "+phrasalVerbWithSuffix.getWord()+", suffix: "+phrasalVerbWithSuffix.getSuffix()+", the whole word: "+phrasalVerbWithSuffix.getWholeWord());
    }
}
