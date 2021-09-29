package com.perscholas.java_basics;

public class ExerciseTwo {

    public static void main(String[] args) {
        /*
        Convert the following binary numbers to decimal notation. Do not use any Java functions or online conversion
        applications to calculate the answer as this will hinder the learning process and your understanding of the
        concept. However, you may check your answers using Java methods.
        */
        String binOne = "0010";//(0*1)+(1*2)+(0*4)+(0*8) = 2
        String binTwo = "1001";//(1*1)+(0*2)+(0*4)+(1*8) = 9
        String binThree = "0011 0100";//(0*1)+(0*2)+(1*4)+(0*8)+(1*16)+(1*32)+(0*64)+(0*128) = 52
        String binFour = "0111 0010";//(0*1)+(1*2)+(0*4)+(0*8)+(1*16)+(1*32)+(1*64)+(0*128) = 114
        String binFive ="0010 0001 1111";//(1*1)+(1*2)+(1*4)+(1*8)+(1*16)+(0*32)+(0*64)+(0*128)+(0*256)+(1*512)+(0*1024)+(0*2048) = 543
        String binSix ="0010 1100 0110 0111";//(1*1)+(1*2)+(1*4)+(0*8)+(0*16)+(1*32)+(1*64)+(0*128)+(0*256)+(0*512)+(1*1024)+(1*2048)+
        //(0*4096)+(1*8192)+(0*16384)+(0*32768) = 11367

        /*
        Write a program that declares an integer a variable x and assigns the value 2 to it
        and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
        Before printing the results, write a comment with the predicted decimal value and binary string.
        Now, print out x in decimal form and in binary notation.
        Do the preceding exercise with the following values: 9, 17, 88
         */
        int x = 2;
        //binary 10, decimal 4.
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println("x << 1 = " + (x << 1));
        int y = 9;
        System.out.println(Integer.toBinaryString(y));
        System.out.println("y << 1 = " + (y << 1));
        int z = 17;
        System.out.println("Binary: " + Integer.toBinaryString(z));
        System.out.println("z << 1 = " + (z << 1));
        int q = 88;
        System.out.println("Binary: " + Integer.toBinaryString(q));
        System.out.println("q << 1 = " + (q << 1));

        /*
        Write a program that declares an integer variable, assigns a number,
        and uses a postfix increment operator to increase the value.
        Print the value before and after the increment operator.
         */
        int p = 5;
        System.out.println(p);
        p++;
        System.out.println(p++);

        /*
        Write a program that demonstrates at least 3 ways to increment a variable by 1
        and does this multiple times. Assign a value to an integer variable, print it,
        increment by 1, print it again, increment by 1, and then print again.
         */
        int o = 10;
        System.out.println(o);
        o = o + 1;
        System.out.println(o);
        o++;
        System.out.println(o);
        ++o;
        System.out.println(o);

    }//end main
}//endclass
