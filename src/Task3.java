//Создайте функцию, которая принимает строку
//(например, " rgb(0, 0, 0)") и возвращает true, если ее формат правильный, в
//противном случае возвращает false.

public class Task3 {
    public static void main(String[] args) {
        System.out.println(validColor("rgb(0,0,0)"));// true
        System.out.println(validColor("rgb(0,,0)"));// false
        System.out.println(validColor("rgb(255,256,255)"));// false
        System.out.println(validColor("rgba(0,0,0,0.123456789)"));// true
    }

    static boolean validColor(String line) {
        if (line.replaceAll("\\w", "") == (line.replaceAll("^[(,.)]", ""))) return false;
        String[] pars = line.split(",,|[(,)]");
        if (pars.length == 4)
            return pars[0].equals("rgb") && Integer.parseInt(pars[1]) <= 255 && Integer.parseInt(pars[2]) <= 255 && Integer.parseInt(pars[3]) <= 255 && Integer.parseInt(pars[1]) >= 0 && Integer.parseInt(pars[2]) >= 0 && Integer.parseInt(pars[3]) >= 0;
        if (pars.length == 5)
            return pars[0].equals("rgba") && Integer.parseInt(pars[1]) <= 255 && Integer.parseInt(pars[2]) <= 255 && Integer.parseInt(pars[3]) <= 255 && Float.parseFloat(pars[4]) <= 1 && Integer.parseInt(pars[1]) >= 0 && Integer.parseInt(pars[2]) >= 0 && Integer.parseInt(pars[3]) >= 0 && Float.parseFloat(pars[4]) >= 0;
        return false;
    }
}