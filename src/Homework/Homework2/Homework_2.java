package Homework.Homework2;

public class Homework_2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0B1100;
        byte b3 = 014;
        byte b4 = 0xC;

        short s1 = 1300;
        short s2 = 0b1001_0110_000;
        short s3 = 0_22_60;
        short s4 = 0x4B0;

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 0_0;
        int i4 = 0x0;

        long l1 = 123_456_789L;
        long l2 = 0b1110_1011_0111_1001_1010_0010_101L;
        long l3 = 0_726_746_425L;
        long l4 = 0x75BCD15L;
        System.out.print(b1 + " " + b2 + " " + b3 + " " + b4 + " - by type 'byte'.");
        System.out.println();
        System.out.print(s1 + " " + s2+ " " + s3 +" "+  s4 + " - by type 'short'.");
        System.out.println();
        System.out.print(i1+  " " + i2+ " "  + i3+ " " +i4 + " - by type 'int'.");
        System.out.println();
        System.out.print(l1 + " " + l2 + " " + l3 + " " + l4 + " - by type 'long'.");
        System.out.println();

        float f1 = 3.14f;
        float f2 = 34.56f;

        double d1 = 45.6785;
        double d2 = 56.6;

        boolean bl1 = true;
        boolean bl2 = false;
        System.out.print(f1 + " and " + f2 + " by type  float.");
        System.out.println();
        System.out.print(d1 +  " and " + d2 + " by type double.");
        System.out.println();
        System.out.print(bl1 + " and " + bl2 + " by type  boolean.");
        System.out.println();

        char c1 = '$';
        char c2 = 4627;
        char c3 = '\u1213';
        System.out.println(c1 + " - the first way.");
        System.out.println(c2 + " - the second way.");
        System.out.println(c3 + " - the third way and the same number as in the second way.");

    }
}

