package feb26;

public class Invoices {

    public static String calculateElectric(int consumption) {
        String result = "";

        if (consumption >= 500 && consumption <= 1000) {
            result = "Good job";
        }
        else if (consumption < 1500) {
            result = "Not bad";
        }
        else if(consumption>=1500){
            result = "Start saving energy";
        }
        else {
            result = "wrong consumption";

        }
        return result;
    }

    public static String calculateInternet(int speed) {
        String usage = "";

        if (speed > 300) {
            usage = "Super Speed";
        } else if (speed > 100) {
            usage = "Good Speed";
        } else{
            usage = "wrong entry";
    }
    return usage;
    }

    public static void main(String[] args) {
        System.out.println(calculateInternet(500));
        System.out.println(calculateElectric(1500));
    }
}
