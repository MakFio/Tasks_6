//Создайте функцию, которая принимает число n и возвращает n-е число в
//последовательности Улама.

public class Task6 {
    public static void main(String[] args) {
        ulam(4);// 4
        ulam(9);// 16
        ulam(206);// 1856
    }

    static void ulam(int n) {
        int [] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        int pos = 2;
        for (int i = 3;; i++) {
            int count = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j] + arr[k] == i) {
                        count++;
                    }
                    if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }
            if (count == 1) {
                arr[pos] = i;
                pos++;
            }
            if (arr[arr.length-1]!=0)
                break;
        }
        System.out.println(arr[arr.length-1]);
    }
}