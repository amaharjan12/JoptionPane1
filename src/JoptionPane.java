/**
 * Author:Alisha Maharjan
 * Date: 9/14/2017
 * Licence: GNU
 * Purpose:Define and declare primitive datatypes
 */

import javax.swing.*;
import java.util.Scanner;

public class JoptionPane {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter a byte value");
        byte b = Keyboard.nextByte();

        System.out.println("Enter a short value");
        short A = Keyboard.nextShort();

        System.out.println("Enter a integer value");
        int I = Keyboard.nextInt();

        System.out.println("Enter a long value");
        long C = Keyboard.nextLong();

        System.out.println("Enter a float value");
        float D = Keyboard.nextFloat();

        System.out.println("Enter a double value");
        double E = Keyboard.nextDouble();

        System.out.println("Enter a character");
        char X = Keyboard.next().charAt(0);

        System.out.println("Enter a boolean value");
        boolean Y = Keyboard.nextBoolean();

        JOptionPane.showMessageDialog(null, "Good Evening" + b + "\n" + "Your short value is" + A + "\n" + "Your int value is" + I + "\n" + "Your long value is" + C + "\n" + "Your float value is" + D + "\n" + "Your double value is" + E + "\n" +
                "Your char value is" + X + "Your boolean value is" + Y + "\n");


    }
}



