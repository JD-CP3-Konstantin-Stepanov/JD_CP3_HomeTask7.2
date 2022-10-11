
class Main {
    private final static String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
            "aliquip ex ea commodo consequat. Duis aute irure dolor " +
            "in reprehenderit in voluptate velit esse cillum dolore eu " +
            "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
            "proident,_sunt_in_culpa_qui_officia_deserunt_mollit_anim_id_est_laborum.";

    public static void main(String[] args) {
        WordsChecker wordsChecker = new WordsChecker(sentence);
        //негативный сценарий тестирования
        System.out.println(wordsChecker.hasWord("iddqd"));
        //позитивный сценарий тестирования
        System.out.println(wordsChecker.hasWord("anim"));
        System.out.println(wordsChecker.hasWord("SINT"));
    }
}