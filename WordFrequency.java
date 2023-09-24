package AssignmentDay15;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        Map<String, Integer> wordFrequency = findWordFrequency(paragraph);
        System.out.println(wordFrequency);
    }

    public static Map<String, Integer> findWordFrequency(String paragraph) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = paragraph.split("\\s+");

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        return wordFrequency;
    }
}