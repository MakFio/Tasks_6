//Напишите функцию, которая возвращает самую длинную неповторяющуюся
//подстроку для строкового ввода.

public class Task7 {
    public static void main(String[] args) {
        longestNonrepeatingSubstring("abcabcbbd");// "abc"
        longestNonrepeatingSubstring("aaaaaa");// "a"
        longestNonrepeatingSubstring("abcde");// "abcde"
        longestNonrepeatingSubstring("abcda");// "abcd"
    }

    static void longestNonrepeatingSubstring(String s) {
        StringBuilder ans = new StringBuilder(String.valueOf(s.charAt(0)));
        StringBuilder max = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (!(ans.toString().contains(String.valueOf(s.charAt(i))))) {
                ans.append(s.charAt(i));
            } else {
                if (ans.length()>max.length()) {
                    max = ans;
                }
                ans = new StringBuilder();
            }
        }
        if (ans.length()>max.length())
            max = ans;
        System.out.println(max);
    }
}