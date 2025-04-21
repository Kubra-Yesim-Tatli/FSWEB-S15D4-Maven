package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder cleaned = new StringBuilder();

        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch);
                cleaned.append(ch);
            }
        }

        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static String convertDecimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binary = new StringBuilder();

        if (number == 0) return "0";

        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}
