public class OddNumber {
    public static void OddNumbers(int a,int b){

        for (int i = a; i <= b; i++) {
            if(i%2==1){
                System.out.println(i);
            }

        }
    }
    public static void EvenNumbers(int a, int b){
        for (int i = a; i < b ; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        OddNumbers(20,35);
        EvenNumbers(3,43);

    }

}
