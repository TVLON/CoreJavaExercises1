package com.perscholas.java_basics;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	/*
	Write a program that declares 2 integer variables, assigns an integer to each, and adds them together
    Assign the sum to a variable. Print out the result.
	 */
        int x = 8, y = 6;
        int z;
        z = x + y;
        out.println("z: " + z);

    /*
    Write a program that declares 2 double variables,
    assigns a number to each, and adds them together. Assign the sum to a variable.
    Print out the result
     */
        double q = 4.5, w = 8.6;
        double e;
        e = q + w;
        out.println("e: " + e);

    /*
    Write a program that declares an integer variable and a double variable,
    assigns numbers to each, and adds them together.
    Assign the sum to a variable. Print out the result. What variable type must the sum be?
     */
        int r = 9;
        double t = 12.7;
        double u;
        u = r + t;
        out.println("u: " + u);

    /*
    Write a program that declares 2 integer variables, assigns an integer to each,
    and divides the larger number by the smaller number. Assign the result to a variable.
    Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
     */
        int i = 10;
        int o = 5;
        int p;
        p = i / o;
        out.println("p: " + p);

        double iTwo = 10.5;
        double pTwo;
        pTwo = iTwo / o;
        out.println("pTwo " + pTwo);
    /*
    Write a program that declares 2 double variables, assigns a number to each,
    and divides the larger by the smaller. Assign the result to a variable.
    Print out the result. Now, cast the result to an integer. Print out the result again.
     */
        double a = 12.4;
        double b = 3.7;
        double f;
        int g = 0;
        f = a / b;
        out.println("f: " + f);
        f = g;
        out.println("f: " + f);
        out.println("g: " + g);

    /*Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
      Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q.
      Print q again.
     */
        int h = 5;
        int j = 6;
        double k;
        k = j / h;
        out.println("k: " + k);
        double l = y;
        k = l / h;
        out.println("k: " + k);

    /*
    Write a program that declares a named constant and uses it in a calculation. Print the result.
     */
        final int C = 16;
        int v = 4;
        int n;
        n = C * v;
        out.println("n: " + n);

    /*
    Write a program where you create 3 variables that represent products at a cafe.
    The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
    Assign prices to each product. Create 2 more variables called subtotal and totalSale
    and complete an “order” for 3 items of the first product, 4 items of the second product,
    and 2 items of the third product. Add them all together to calculate the subtotal.
    Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
    Be sure to format the results to 2 decimal places.
     */
        double coffee = 6.99;
        double frappe = 8.59;
        double tea = 3.39;
        final double SALES_TAX = .07;
        double subTotal = 0.0;
        double totalSale = 0.0;
        subTotal = (coffee * 3) + (frappe * 4) + (tea * 2);
        out.printf("Sub Total: " + "$" + "%.2f", + subTotal);
        totalSale = subTotal + (subTotal * SALES_TAX);
        System.out.printf("\n" + "Total Sale: " + "$" + "%.2f", + totalSale);


    }//end main
}//end class
