package rohit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {

    public static void main(String[] args) {
        List<String> dict;
        String[] str ={"cat","rat","bat","in","stand", "with"};
        dict = Arrays.asList(str);

        String sentence = "the cattle was rattled by the  battery";
        replaceWords(dict, sentence);

    }
    static String replaceWords(List<String> dict, String sentence) {
        Set<String> rootset = new HashSet<>();
        for (String root: dict) rootset.add(root);

        StringBuilder ans = new StringBuilder();
        for (String word: sentence.split("\\s+")) {
            String prefix = "";
            for (int i = 1; i <= word.length(); ++i) {
                prefix = word.substring(0, i);
                if (rootset.contains(prefix)) break;
            }
            if (ans.length() > 0) ans.append(" ");
            ans.append(prefix);
        }
        System.out.println(ans.toString());
        return ans.toString();

    }

}
