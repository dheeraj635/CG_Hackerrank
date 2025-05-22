import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String[] words = s.trim().split("[^a-zA-Z]+");
        
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.add(word);
            }
        }

        System.out.println(result.size());
        for (String word : result) {
            System.out.println(word);
        }
    }
}
