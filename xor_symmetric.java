import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class xor_symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String Msg = sc.next();
        char key = '$';
        String CTxt = "";
        String DTxt = "";
        int xor, xor1;
        char temp, temp1;
        for (int i = 0; i < Msg.length(); i++) {
            xor = Msg.charAt(i) ^ key;
            temp = (char) xor;
            CTxt = CTxt + temp;
        }
        System.out.println("Encrypted String is " + CTxt);
        for (int i = 0; i < CTxt.length(); i++) {
            xor1 = CTxt.charAt(i) ^ key;
            temp = (char) xor1;
            DTxt = DTxt + temp;
        }
        System.out.println("Decrypted String is : " + DTxt);
    }
}