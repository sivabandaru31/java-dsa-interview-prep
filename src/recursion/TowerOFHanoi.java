package recursion;

public class TowerOFHanoi {
    static void towerofHanoi(int n, char s, char h, char d) {

        if (n == 0) {
            return;
        }

        towerofHanoi(n - 1, s, d, h);

        System.out.println("Move from " + s + " to " + d);

        towerofHanoi(n - 1, h, s, d);
    }

    public static void main(String[] args) {

        int n = 3;

        towerofHanoi(n, 'S', 'H', 'D');
    }
}
