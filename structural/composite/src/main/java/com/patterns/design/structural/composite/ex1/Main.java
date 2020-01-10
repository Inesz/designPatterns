package com.patterns.design.structural.composite.ex1;

public class Main {
    public static void main(String args[]) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();

        System.out.println("==============================");

        Department financialDepartment2 = new FinancialDepartment(4, "Financial department");
        HeadDepartment headDepartment2 = new HeadDepartment(5, "Head department");

        headDepartment2.addDepartment(financialDepartment2);
        headDepartment2.addDepartment(headDepartment);

        headDepartment2.printDepartmentName();

    }
}

/*
how about headDepartment??

 output:

SalesDepartment
FinancialDepartment
==============================
FinancialDepartment
SalesDepartment
FinancialDepartment


 */