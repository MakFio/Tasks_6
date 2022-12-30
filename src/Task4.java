//Создайте функцию, которая принимает URL (строку), удаляет дублирующиеся
//параметры запроса и параметры, указанные во втором аргументе (который будет
//необязательным массивом).

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2"));// "https://edabit.com?a=2&b=2"
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2"));// "https://edabit.com?a=2&b=2"
        System.out.println(stripUrlParams("https://edabit.com"));// "https://edabit.com"
    }

    public static String stripUrlParams(String http) {
        if (http.indexOf('?') == -1) return http;
        String[] pars = http.split("[&,?=]");
        HashMap<String, String> uniq = new HashMap<>();
        for (int i = 1; i < pars.length; i += 2) uniq.put(pars[i], pars[i + 1]);
        return pars[0] + '?' + (uniq.toString().replaceAll(", ", "&").replaceAll("[{}]", ""));
    }
}