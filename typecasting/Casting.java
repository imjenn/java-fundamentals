// This program demonstrates explicit casting
class Casting {
    public static void main(String[] args) {
        double d = 35.25;
        double dd = 35.99;
        
        // casting the double d into a int
        int i = (int) d;
        
        // casting the double dd into a int
        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);

        // This code demonstrates implicit casting
        int iii = 35;
        float f = iii;
        System.out.println("The number is: " + f);
    }
}

