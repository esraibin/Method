package feb26;

public class PasswordLetters { // lowercase char 97 -122
    public static void main(String[] args) {
           generateLetterPass(6);
        System.out.println();
           generateLettersPass(10);
    }

    public static void generateLetterPass(int passLen) {
        for (int i = 0; i < passLen; i++) {
            int one = 97 + (int) (Math.random() * 26);
            System.out.print((char) one);
        }
    }
    public static void generateLettersPass(int passLength){
        for (int i = 0; i <passLength ; i++) {
            System.out.print((char)(97+(int)(Math.random()*26)));

        }

    }

}
