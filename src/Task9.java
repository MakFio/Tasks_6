//Создайте функцию, которая принимает строку и возвращает true или false в
//зависимости от того, является ли формула правильной или нет.

public class Task9 {
    public static void main(String[] args) {
        formula("6 * 4 = 24");// true
        formula("18 / 17 = 2");// false
        formula("16 * 10 = 160 = 14 + 120");// false
    }

    static void formula(String s) {
        String[] a = s.split(" ");
        StringBuilder ur = new StringBuilder();

        if (!a[1].equals("*"))
            ur.append(a[0]+" ");
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i].equals("*")) {
                ur.append(String.valueOf(Integer.parseInt(a[i - 1]) * Integer.parseInt(a[i + 1])) + " ");
            } else if ((!a[i].equals("*")) && (!a[i + 1].equals("*")) && (!a[i - 1].equals("*"))) {
                ur.append(a[i] + " ");
            }
        }
        if (a[a.length-2].equals("="))
            ur.append(a[a.length-1]);
        a = ur.toString().split(" ");
        ur = new StringBuilder();

        if (!a[1].equals("/"))
            ur.append(a[0]+" ");
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i].equals("/")) {
                ur.append(String.valueOf(Double.parseDouble(a[i - 1]) / Double.parseDouble(a[i + 1])) + " ");
            } else if ((!a[i].equals("/")) && (!a[i + 1].equals("/")) && (!a[i - 1].equals("/"))) {
                ur.append(a[i] + " ");
            }
        }
        if (a[a.length-2].equals("="))
            ur.append(a[a.length-1]);
        a = ur.toString().split(" ");
        ur = new StringBuilder();

        if (!a[1].equals("+"))
            ur.append(a[0]+" ");
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i].equals("+")) {
                ur.append(String.valueOf(Integer.parseInt(a[i - 1]) + Integer.parseInt(a[i + 1])) + " ");
            } else if ((!a[i].equals("+")) && (!a[i + 1].equals("+")) && (!a[i - 1].equals("+"))) {
                ur.append(a[i] + " ");
            }
        }
        if (a[a.length-2].equals("="))
            ur.append(a[a.length-1]);
        a = ur.toString().split(" = ");
        ur = new StringBuilder(a[0] + " ");

        double sum = 0;
        double ans = 1;
        for (int i = 0; i < a.length; i++)
            sum+=Double.parseDouble(a[i]);
        for (int i = 0; i < a.length; i++) {
            if (Double.parseDouble(a[i]) != sum/a.length) {
                ans = 0;
            }
        }
        System.out.println(ans == 1);
    }
}