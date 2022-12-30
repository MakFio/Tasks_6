//Создайте функцию, которая принимает число n и возвращает соответствующее число Белла.

public class Task1 {

    public static void main(String[] args) {
        bell(1);// 1
        bell(2);// 2
        bell(3);// 5
        bell(4);// 15
        bell(5);// 52
    }

    static void bell(int n) {
        int sum = 0;
        for (int i = 1; i < n+1; i++)
            sum+=stirling(n,i);
        System.out.println(sum);
    }
    static int stirling(int n, int k) { //числа Стирлинга второго рода
        if ((k==1) || (k==n))
            return 1;
        else
            return stirling(n-1, k-1) + k*stirling(n-1, k);
    }
}