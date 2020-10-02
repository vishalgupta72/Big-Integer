/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author VISHAL
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Big_Integer {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     BigInteger bi1 = new BigInteger(sc.next());
     BigInteger bi2 = new BigInteger(sc.next());

        BigInteger  bi3, bi4;

        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);


        System.out.println( bi3);
        System.out.println( bi4);

    }
}