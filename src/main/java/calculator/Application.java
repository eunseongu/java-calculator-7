package calculator;

import java.util.Scanner;

public class Application {
    public static String[] getCustomDelimiterAndContent(String input) {
        if (input.startsWith("//")) {
            int delimiterEndIndex = input.indexOf("\\n");
            if (delimiterEndIndex != -1) {
                String customDelimiter = input.substring(2, delimiterEndIndex);
                String content = input.substring(delimiterEndIndex + 1);
                return new String[]{customDelimiter, content};
            }
        }
        return new String[]{"", input};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your input");
        String input = scanner.nextLine();

        String[] delimiterAndContent = getCustomDelimiterAndContent(input);
        String customDelimiter = delimiterAndContent[0];
        String contentWithoutDelimiter = delimiterAndContent[1];
    }
}