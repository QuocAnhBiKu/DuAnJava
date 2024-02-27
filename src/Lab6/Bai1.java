package Lab6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        Pattern pattern = Pattern.compile("[0-9]{6,}");
        Matcher matcher = pattern.matcher(a);
        System.out.println(matcher.matches());
    }
}
