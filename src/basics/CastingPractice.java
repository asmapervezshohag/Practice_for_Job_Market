package basics;

public class CastingPractice {
    /*
    Casting is converting one data type into another data type.
    -Widening= no data loss
    - Narrowing= data loss
     */
    public static void main(String[] args) {
        int x= 8;
        long y=x;
        System.out.println(y);
        // Wrapper Class - Primitive to Non-Primitive
        String a= "15";
        String b="20";
        int c=Integer.valueOf(a);
        int d= Integer.valueOf(b);
        System.out.println(c+d);

    }
}
