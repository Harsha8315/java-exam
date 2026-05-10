package com.java.exam;

import java.util.Scanner;

public class Q30 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first word: ");
            String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

            System.out.print("Enter second word: ");
            String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

            if (str1.length() != str2.length()) {
                System.out.println("Not Anagrams");
                return;
            }

            int[] freq = new int[26];

            for (int i = 0; i < str1.length(); i++) {
                freq[str1.charAt(i) - 'a']++;
                freq[str2.charAt(i) - 'a']--;
            }

            boolean isAnagram = true;

            for (int count : freq) {
                if (count != 0) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println(str1 + " and " + str2 + " are Anagrams!");
            } else {
                System.out.println("Not Anagrams");
            }
        }
}