//Создайте функцию, которая принимает арабское число и преобразует его в римское
//число

public class Task8 {
    public static void main(String[] args) {
        convertToRoman(2);// "II"
        convertToRoman(12);// "XII"
        convertToRoman(16);// "XVI"
        convertToRoman(3999);// "MMMCMXCIX"
    }

    static void convertToRoman(int n) {
        String[] r1 = new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] r2 = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] r3 = new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] r4 = new String[] { "", "M", "MM", "MMM"};
        System.out.println(r4[n/1000] + r3[n%1000/100] + r2[n%100/10] + r1[n%10]);
    }
}