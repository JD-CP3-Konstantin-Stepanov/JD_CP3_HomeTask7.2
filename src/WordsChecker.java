import java.util.Set;
import java.util.HashSet;

class WordsChecker {

    private final String sentence;
    private final Set<String> splitSentence;

    public WordsChecker(String Sentence) {
        this.sentence = Sentence;
        splitSentence = new HashSet<>();
    }

    public boolean hasWord(String SearchWord) {

        String[] wordsArray = sentence.split("\\P{IsAlphabetic}+");
        for (String value : wordsArray) {
            splitSentence.add(value.toLowerCase());
        }

        return splitSentence.contains(SearchWord.toLowerCase());
    }

}