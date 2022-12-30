//Напишите две функции, чтобы сделать переводчик с английского на свинский латинский.
//Первая функция translateWord (word) получает слово на английском и возвращает это
//слово, переведенное на латинский язык. Вторая функция translateSentence (предложение)
//берет английское предложение и возвращает это предложение, переведенное на латинский
//язык.

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        translateWord("Flag");// "Agflay"
        translateWord("Apple");// "Appleyay"
        translateWord("button");// "uttonbay"
        translateWord("");// ""
        translateSentence("I like to eat honey waffles.");// "Iyay ikelay otay eatyay oneyhay afflesway."
        translateSentence("Do you think it is going to rain today?");// "Oday youyay inkthay ityay isyay oinggay otay ainray odaytay?"
    }

    static void translateWord(String s) {
        String[] vowels = new String[] { "a", "e", "i", "o", "u", "y"};
        if ((s.length()>0) && (Arrays.asList(vowels).contains(String.valueOf(s.charAt(0)).toLowerCase())))  {
            s += "yay";
        } else  if ((s.length()>0) && !(Arrays.asList(vowels).contains(String.valueOf(s.charAt(0)).toLowerCase()))) {
            char Ucase = s.charAt(0);
            s = s.toLowerCase();
            while (!(Arrays.asList(vowels).contains(String.valueOf(s.charAt(0)).toLowerCase()))) {
                s+= String.valueOf(s.charAt(0));
                s = s.substring(1);
            }
            if (Ucase < 'a')
                s = s.substring(0,1).toUpperCase()+s.substring(1);
            s+="ay";
        }
        System.out.println(s);
    }

    static void translateSentence(String str) {
        String[] vowels = new String[] { "a", "e", "i", "o", "u", "y"};
        String[] a = str.split(" ");
        String ans = "";
        for (int i = 0; i < a.length; i++) {
            String symb = "";
            String s = a[i];
            if (!(Character.isLetter(s.charAt(s.length()-1)))){
                symb = String.valueOf(s.charAt(s.length()-1));
                s = s.substring(0,s.length()-1);
            }
            if (Arrays.asList(vowels).contains(String.valueOf(s.charAt(0)).toLowerCase())) {
                s += "yay";
            } else {
                char Ucase = s.charAt(0);
                s = s.toLowerCase();
                while (!(Arrays.asList(vowels).contains(String.valueOf(s.charAt(0)).toLowerCase()))) {
                    s+= String.valueOf(s.charAt(0));
                    s = s.substring(1);
                }
                if (Ucase < 'a')
                    s = s.substring(0,1).toUpperCase()+s.substring(1);
                s+="ay";
            }
            ans = ans + s + symb + " ";

        }
        System.out.println(ans);
    }
}