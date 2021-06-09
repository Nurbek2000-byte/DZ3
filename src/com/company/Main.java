package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        double[] num = {1.1, -2.3, 3.1, 5.4, 1.3, -2.4, -1.8, 8.5, 6.4, 6.3, 4.5, 2.2, 6.5, 4.5, 2.3};
        double run = 0.0;
        int cifry = 0;
        boolean islogika = false;

        for (double g : num) {
            if (g < 0) {
                islogika = true;
            } else if (islogika) {
                run = run + g;
                cifry++;
            }
        }
        double resoult = run / cifry;
        System.out.println("итог " + resoult);
    }
            }









