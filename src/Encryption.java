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

    public char getAlphabet(int value){
       if (value < 0 || value >25){
           System.out.println("Input Error");
           return '0';
       }
        return alphabets.get(value);

    }

    public int getPosition(char value){
        if (!Character.isLetter(value)) {
            System.out.println("Input Error");
            return -1;
        }
        return alphabets.indexOf(Character.toLowerCase(value));
    }
<<<<<<< HEAD
    public char getSymbol(int position){
        if (position < 0 || position >25){
            System.out.println("Input Error");
            return '0';
    }
=======

        public char getSymbol(int position) {
        if (position < 0 || position > 25) {
            System.out.println("Input Error");
            return '0';
        }
>>>>>>> 8b07be8686df68b488c0b9a2e2e606512253a16a
        return symbols.get(position);

    }

<<<<<<< HEAD
=======
    public int getSymbolPosition(char symbol) {
        if (!Character.isLetter(symbol)) {
            System.out.println("Input Error");
            return -1;
        }
        return alphabets.indexOf(symbol);
    }
>>>>>>> 8b07be8686df68b488c0b9a2e2e606512253a16a
}

