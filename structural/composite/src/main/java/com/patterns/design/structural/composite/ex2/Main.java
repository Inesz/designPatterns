package com.patterns.design.structural.composite.ex2;

public class Main {
    public static void main(String args[]) {
        DepartmentComponent salesDepartment = new SalesDepartmentLeaf(1, "Sales department");
        DepartmentComponent financialDepartment = new FinancialDepartmentLeaf(2, "Financial department");

        HeadDepartmentComposite headDepartment = new HeadDepartmentComposite(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();

        System.out.println("=========================================");

        DepartmentComponent financialDepartment2 = new FinancialDepartmentLeaf(4, "Financial department 2");

        HeadDepartmentComposite headDepartment2 = new HeadDepartmentComposite(5, "Head department 2");

        headDepartment2.addDepartment(financialDepartment2);
        headDepartment2.addDepartment(headDepartment);

        headDepartment2.printDepartmentName();
    }
}

/*

 output:

HeadDepartmentComposite
SalesDepartmentLeaf
FinancialDepartmentLeaf
=========================================
HeadDepartmentComposite
FinancialDepartmentLeaf
HeadDepartmentComposite
SalesDepartmentLeaf
FinancialDepartmentLeaf

 */