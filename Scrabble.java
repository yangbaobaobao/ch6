class Scrabble {
    public static void main(String[] args) {
        System.out.println(canSpell("ethan", "het"));
        System.out.println(canSpell("ethan", "zxy"));
    }

    public static boolean canSpell(String str, String word) {
        for (char c : str.toCharArray()) {
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i) == c) {
                    word = word.substring(0, i) + word.substring(i+1);
                    break;
                }
            }
        }
        return word.length() == 0;
    }
}
