//Создайте функцию, которая возвращает значение true, если само число является
//палиндромом или любой из его потомков вплоть до 2 цифр

public class Task10 {
    public static void main(String[] args) {
        palindromeDescendant(11211230);// true
        palindromeDescendant(13001120);// true
        palindromeDescendant(23336014);// true
        palindromeDescendant(11);// true
    }

    static void palindromeDescendant(int n) {
        int ans = 0;
        int b = 0;
        StringBuilder b1 = new StringBuilder();
        while(n>10) {
            int a = String.valueOf(n).length()/2;
            if (n/(int)Math.pow(10,a) == n%(int)Math.pow(10,a)) {
                ans = 1;
                break;
            } else {
                for (int i = 0; i < a; i++) {
                    b = ((n%(int)Math.pow(10,1) + n%(int)Math.pow(10,2)/10));
                    n/=100;
                    b1.append(b);
                }
                n = Integer.parseInt(b1.reverse().toString());
                b1 = new StringBuilder("");
            }
        }
        System.out.println(ans == 1);
    }
}