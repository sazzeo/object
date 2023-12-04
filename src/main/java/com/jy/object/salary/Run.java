package com.jy.object.salary;

import java.util.List;
import java.util.Scanner;

public class Run {

    public static List<Long> PAY = List.of(1000L);
    public static List<String> NAMES = List.of("지영");

    public static void main(String[] args) {
        Run run = new Run();
        String name = "지영";
        Double pay = run.calculatePay(name);
        run.describeResult(name ,pay);
    }


    private Double calculatePay(final String name) {
        double textRate = this.getTextRate();
        long salary = findSalaryByName(name);
        return salary * (1 - textRate);
    }


    //소득세율 계산
    private double getTextRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세율을 입력하세요");
        return scanner.nextDouble();
    }

    private long findSalaryByName(final String name) {
        int i = NAMES.indexOf(name);
        return PAY.get(i);
    }


    private void describeResult(final String name, final Double pay) {
        System.out.printf("이름: %s, 급여: %f", name, pay);
    }

}
