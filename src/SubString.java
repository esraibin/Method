import javax.swing.*;

public class SubString {
    // beginnig part is missing
    public static String replaceCharacter(String text, char remove, char replace){
        String newWord = "";

        for (int i = 0; i <text.length() ; i++) {
            if( text.charAt(i) == remove){
                System.out.println(replace);
            }
            else {
                System.out.println(text.charAt(i));
            }
        }
        return newWord;
    }
}
