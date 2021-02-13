package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "потоп";
	boolean isPalindrom = true;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            if (  str.charAt(i)  != str.charAt(str.length()-i - 1)){
                isPalindrom = false;
            }
        }
        System.out.println(isPalindrom);
        //second way
        String revarse = "";
        for (int i = 0; i < str.length(); i++) {
            revarse += str.charAt(str.length()-1 -i );
        }
        System.out.println(revarse);
        if (str.equals(revarse)){
            isPalindrom = true;
        }
        System.out.println(isPalindrom);
    }
}
