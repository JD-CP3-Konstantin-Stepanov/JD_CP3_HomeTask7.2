import java.util.Set;
import java.util.HashSet;

class WordsChecker {

    protected String sentence;

    public WordsChecker(String Sentence) {
        this.sentence = Sentence;
    }

    public boolean hasWord(String SearchWord) {
        Set<String> splitSentence = new HashSet<>();
        String[] wordsArray = sentence.split("\\P{IsAlphabetic}+");

        for (String value : wordsArray) {
            splitSentence.add(value.toLowerCase());
        }

        return splitSentence.contains(SearchWord.toLowerCase());
    }

}