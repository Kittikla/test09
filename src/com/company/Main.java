package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for (int i = 1; i <= p; i++) {
            int w = 0;
            int un = 0;
            while (true) {
                int x = in.nextInt();
                if (x != 0) {
                    if (x >= 0) {
                        w++;
                    } else {
                        un++;
                    }

                }else{
                    break;
                }

            }System.out.printf("%d %d %.2f%%\n", w, un, (float) (100 * w) / (un + w));
        }
    }
}


