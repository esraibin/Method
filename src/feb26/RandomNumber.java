package feb26;

public class RandomNumber {
    public static void main(String[] args) {
        generatePass();
        System.out.println(generatePassword());
    }
    public static void generatePass(){
        for (int i = 0; i <6 ; i++) {
            System.out.print((int)(Math.random()*10));//Math.random creates random num between 0-1
            //(int) allow us change these number to integer with void
        }
        System.out.println();
    }
    public static String generatePassword(){ // 6 digit password all numbers with return type
        String result="";
        for (int i = 0; i <6 ; i++) {
            result += (int) (Math.random()*10);

        }
        return result;
    }

}
