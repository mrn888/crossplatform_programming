package com.nulp.cp.demo;

import com.nulp.cp.series.HarmonicSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readN();
        HarmonicSeries series = new HarmonicSeries(n);
        series.calculate();
    }

    public static int readN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of the series iteration:");
        return sc.nextInt();
    }
}
