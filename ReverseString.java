package Nomor8;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> huruf = new Stack<>();
        System.out.print("Masukkan Kata : ");
        String kata = sc.nextLine();
        String reverse = "";

        for (int i = 0; i < kata.length(); i++) {
            char x = kata.charAt(i);
            huruf.push(x);
        }
        while (!huruf.empty()){
            reverse+=huruf.pop();
        }

        System.out.println(reverse);
    }
}