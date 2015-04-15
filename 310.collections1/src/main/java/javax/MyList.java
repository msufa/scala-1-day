package javax;

import java.util.List;
import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        assert(args.length >= 1);

        List<String> list = new ArrayList<String>();
        for(int i = 0; i < args.length; i++) {
            list.add(args[i]);
        }

        List<String> reversedTail = reverseTail(list);
        printList(reversedTail);
    }

    private static List<String> reverseTail(final List<String> in) {
        List<String> reversed = new ArrayList<String>();
        if (in.size() == 0) {
            return new ArrayList<String>();
        } else {
            reversed.add(0, in.get(0));
            for(int i = 1; i < in.size(); i++) {
                reversed.add(1, in.get(i));
            }
            return reversed;
        }
    }

    private static void printList(final List<String> in) {
        for(int i = 0; i < in.size(); i++) {
            if (i == 0) {
                System.out.print(in.get(i));
            } else {
                System.out.print(", " + in.get(i));
            }
        }
        System.out.println();
    }
}
