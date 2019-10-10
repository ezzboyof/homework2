package homework2;

public class task_8 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int all = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                even += i;
            }else {
                odd+=i;
            }
            all+=i;
        }
        System.out.println("sum even = " + even);
        System.out.println("sum odd = " + odd);
        System.out.println("sum all = " + all);
    }
}
