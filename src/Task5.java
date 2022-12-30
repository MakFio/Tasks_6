//Напишите функцию, которая извлекает три самых длинных слова из заголовка
//газеты и преобразует их в хэштеги. Если несколько слов одинаковой длины,
//найдите слово, которое встречается первым.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        getHashTags("How the Avocado Became the Fruit of the Global Trade");// ["#avocado", "#became", "#global"]
        getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year");// ["#christmas", "#probably", "#will"]
        getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit");// ["#surprise", "#parents", "#fruit"]
        getHashTags("Visualizing Science");// ["#visualizing", "#science"]
    }

    static void getHashTags(String s) {
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j].length()<a[j+1].length()) {
                    String str = a[j];
                    a[j] = a[j+1];
                    a[j+1] = str;
                }
            }
        }
        int n = 3;
        if (a.length<3)
            n = a.length;
        String[] ans = new String[n];
        for (int i = 0; i < a.length; i++) {
            ans[i] = "#" + a[i].toLowerCase();
            if (i==2)
                break;
        }
        System.out.println(Arrays.toString(ans));
    }
}