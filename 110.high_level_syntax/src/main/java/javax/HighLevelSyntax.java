package javax;

public class HighLevelSyntax {
    private static String buildString(final String one, final String two) {
        return one + " " + two;
    }

    private static String getParameter(String[] args) {
	if (args.length == 1) {
	    return args[0];
	} else {
            return null;
        }
    }

    public static void main(String[] args) {
	final String hello = "Hello";

        String name = getParameter(args);
        if (name == null) {
            name = "World!";
        }

	System.out.println(buildString(hello, name));
    }
}
