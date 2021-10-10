package com.nulp.cp.series;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HarmonicSeries implements Series {
    private int n;
    private double sum = 0;
    private BigDecimal bigSum;

    private int DIVISION_SCALE = 15;
    private int CALCULATION_LIMIT = 15;

    public HarmonicSeries(int n) {
        this.n = n;
        System.out.println("The Harmonic Series object was created");
        System.out.println("The number of addition for series is " + n);
    }

    @Override
    public void calculate() {
        if (n <= CALCULATION_LIMIT) {
            System.out.println("The number of addition is less than calculation limit");
            System.out.println("Using primitive types for calculating sum");

            StringBuilder output = new StringBuilder();
            output.append("Z = ");

            for(int i = 1; i <= n; i++) {
                output.append("1/").append(i).append(" + ");
                sum += 1 / (double) i;
            }
            output.setLength(output.length() - 2);

            System.out.println(output);
            System.out.println("Sum of Harmonic Series is " + sum);
        } else {
            bigSum = new BigDecimal(0);
            System.out.println("The number of addition is more than calculation limit");
            System.out.println("Using DigDecimal wrapper class for calculating sum");

            StringBuilder output = new StringBuilder();
            output.append("Z = ");

            for(int i = 1; i<= n; i++) {
                output.append("1/").append(i).append(" + ");
                BigDecimal addition = new BigDecimal(1)
                        .divide(new BigDecimal((i)), DIVISION_SCALE, RoundingMode.CEILING);
                bigSum = bigSum.add(addition);
            }
            output.setLength(output.length() - 2);

            System.out.println(output);
            System.out.println("Sum of Harmonic Series is " + bigSum);
        }
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSum() {
        return sum;
    }

    public BigDecimal getBigSum() {
        return bigSum;
    }
}
