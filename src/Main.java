
public class Main {
    public static void main(String[] args) {
        System.out.print(getMessage());
        System.out.println("What will be i after the cycle?");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            System.out.println("Now i is" + i);
        }

    }
    private static String getMessage(){
        return "Buongiorno a tutti!\n";
    }
}