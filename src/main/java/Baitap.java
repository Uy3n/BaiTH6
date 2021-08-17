import java.util.Locale;
import java.util.Scanner;

public class Baitap {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi s: ");
        String s = sc.nextLine();

//        Bài 1
//        System.out.println("Chuoi s in hoa: " + s.toUpperCase());
//        Bài 2
//        System.out.println("Chuoi s khi khong co so la: " + printNonNumber(s));
//        Bài 3
//        char c = sc.next().charAt(0);
//        System.out.println("So lan ki tu xuat hien trong chuoi s la: " + countChar(s, c));
//        Bài 4
//        System.out.println("So tu trong chuoi s la: " + countWord(s));
//        Bài 7
//        countVowelAndConsonant(s);
    }

    public static String printNonNumber(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                continue;
            }
            result += s.charAt(i);
        }
        return result;
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (char i : s.toCharArray()) {
            if (i == c) {
                count++;
            }
        }
        return count;
    }

    public static int countWord(String s) {
        String[] str = s.split("\\s+");
        return str.length;
    }

    public static void countVowelAndConsonant(String s) {
        int countVowel = 0;
        int countConsonant = 0;
        s = s.toLowerCase();
        for (char i : s.toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                countVowel++;
            } else if (i >= 'a' && i <= 'z') {
                countConsonant++;
            }
        }
        System.out.println("So nguyen am trong chuoi s la: " + countVowel);
        System.out.println("So phu am trong chuoi s la: " + countConsonant);
    }
}
