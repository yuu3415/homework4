package org.example;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (sum > 30) {
                System.out.println("sumが30を超えたため処理を中断します。");
                break;
            }
            if (i % 2 == 0) {
                printStar(i);
                sum += i;
            }
        }
    }

    private static void printStar(final int num) {
        System.out.println("*".repeat(num));
    }
}
