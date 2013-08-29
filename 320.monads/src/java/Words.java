import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Words {
    public static void main(String[] args) {
        Set<String> keywords = new HashSet<String>();
        try {
            Reader isr = new InputStreamReader(getClass().getResourceAsStream("keywords.txt"));
            Reader br = new BufferedReader(isr);
            String line;
            while (line = br.readLine() != null) {
                keywords.add(line)
            }
        }

        List<String> words = new LinkedList<String>();
        for (String arg : args) {
            String[] parts = arg.split(" ");
            for (String part : parts) {
                if (part.length() > 0) {
                    words.add(part);
                }
            }
        }

        if (words.size() == 0) {
            System.out.println("No words!");
        } else {
            System.out.println("First word is " + words.get(0));
            StringBuilder b = new StringBuilder();
            for (int i = 1; i < words.size(); i++) {
                if (i != 1) b.append(",");
                b.append(words.get(i));
            }
            System.out.println("Remaining words are " + b.toString());
        }

        boolean found = false;
        for (String word : words) {
            if (keywords.contains(word.toLowerCase())) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Words contain keywords");
        }

        if (words.size() > 0) {
            boolean ok = true;
            for (String word : words) {
                if (!keywords.contains(word.toLowerCase())) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("Words contain only keywords");
            }
        }

        String firstNonKeyword = null;
        for (String word : words) {
            if (!keywords.contains(word.toLowerCase())) {
                firstNonKeyword = word;
                break;
            }
        }
        if (firstNonKeyword != null) {
            System.out.println("First non-keyword is " + firstNonKeyword);
        } else {
            System.out.println("No keywords!");
        }
    }
}
