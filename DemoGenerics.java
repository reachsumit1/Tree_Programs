package AssignmentDay15;
import java.util.HashMap;
import java.util.Map;

public class DemoGenerics {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        Map<String, Integer> wordFrequency = findWordFrequency(sentence);
        System.out.println(wordFrequency);
    }

    public static Map<String, Integer> findWordFrequency(String sentence) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        return wordFrequency;
    }
}