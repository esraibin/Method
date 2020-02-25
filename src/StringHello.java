public class StringHello {
    public static void main(String[] args) {
        printHello("Hello");

    }
    public static void printHello(String index){
        for (int i = 0; i < index.length() ; i++) {

            System.out.println(index.charAt(i));
        }
    }
}
