import java.util.ArrayList;

public class Encryption {

    ArrayList<Character> symbols = new ArrayList<Character>();
    ArrayList<Character> alphabets = new ArrayList<Character>();
    public Encryption() {
        symbols.add('!');
        symbols.add('@');
        symbols.add('#');
        symbols.add('$');
        symbols.add('^');
        symbols.add('&');
        symbols.add('*');
        symbols.add('(');
        symbols.add(')');
        symbols.add('_');
        symbols.add('-');
        symbols.add('+');
        symbols.add('=');
        symbols.add('?');
        symbols.add(',');
        symbols.add('{');
        symbols.add('}');
        symbols.add('[');
        symbols.add(']');
        symbols.add('/');
        symbols.add('|');
        symbols.add(';');
        symbols.add(':');
        symbols.add('.');
        symbols.add('<');
        symbols.add('>');
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabets.add(letter);
        }
    }
}
