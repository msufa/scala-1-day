package javax;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

interface Callback {
  void func(String str);
}

class MyCallback implements Callback {
  @Override
  public void func(final String str) {
    System.out.print(str);
  }
}

public class HighLevelSyntax {

  private static void functionAsParameter(final Callback callback, final String str) {
    callback.func(str);
  }

  private static Callback functionAsReturnType(final Callback callback) {
    return callback;
  }

  public static void main(String[] args) {
    final String hello = "Hello";
    final String space = " ";
    final String world = "World!";

    final List<String> words = new LinkedList<String>();

    words.add(hello);
    words.add(space);
    words.add(world);

    Callback myCallback = new MyCallback();
 
    functionAsParameter(myCallback, words.get(0));
    functionAsParameter(myCallback, words.get(1));
    functionAsReturnType(myCallback).func(words.get(2));

    System.out.println();
  }
}
