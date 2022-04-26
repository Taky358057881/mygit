import java.util.*;

public class Main {
    static int all[] = {100, 50, 20, 10, 5, 2, 1};
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i = 0; i < 7; i++) {
            System.out.println(all[i] + ":" + n / all[i]);
            n %= all[i];
        }
    }
}
