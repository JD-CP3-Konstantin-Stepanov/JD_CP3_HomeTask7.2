import java.util.Set;
import java.util.HashSet;

class WordsChecker {

    private final Set<String> splitSentence;

    public WordsChecker(String Sentence) {
        splitSentence = new HashSet<>();
        String[] wordsArray = Sentence.split("\\P{IsAlphabetic}+");
        for (String value : wordsArray) {
            splitSentence.add(value.toLowerCase());
        }
    }

    public boolean hasWord(String SearchWord) {
        return splitSentence.contains(SearchWord.toLowerCase());
    }

}