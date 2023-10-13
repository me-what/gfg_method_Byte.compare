public class Main {
    public static void main(String[] args) {
        byte a = 20;
        byte b = 20;
        int output = Byte.compare(a, b);
        System.out.println("Comparing " + a
                + " and " + b + " : "
                + output);


        byte a2 = 20;
        byte b2 = 10;
        int output2 = Byte.compare(a2, b2);
        System.out.println("Comparing " + a2
                + " and " + b2 + " : "
                + output2);


        byte a3 = 10;
        byte b3 = 20;
        int output3 = Byte.compare(a3, b3);
        System.out.println("Comparing " + a3
                + " and " + b3 + " : "
                + output3);
    }
}