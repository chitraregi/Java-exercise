public class MyChar {
    private char ch;

    MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;

        return false;
    }

    public boolean isConsonant() {
        if (isAlpha() && !isVowel())
            return true;

        return false;

    }

    public boolean isDigit() {
        if (ch >= 48 && ch <= 57)// between '0' and '9'
            return true;

        return false;
    }

    public boolean isAlpha() {
        if (ch >= 97 && ch <= 122) // between 'a' and 'z'
            return true;

        return false;
    }

    public static void main(String[] args) {
        MyChar mychar = new MyChar('a');
        System.out.println(mychar.isVowel());
        System.out.println(mychar.isConsonant());
        System.out.println(mychar.isDigit());
        System.out.println(mychar.isAlpha());

    }
}
