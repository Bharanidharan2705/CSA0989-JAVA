import java.util.HashMap;

public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "abcb";
        printUniqueCharacters(input);
    }

    public static void printUniqueCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }
