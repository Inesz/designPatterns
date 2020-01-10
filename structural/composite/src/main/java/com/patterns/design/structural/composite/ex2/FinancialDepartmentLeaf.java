package com.patterns.design.structural.composite.ex2;

public class FinancialDepartmentLeaf implements DepartmentComponent {

    private Integer id;
    private String name;

    public FinancialDepartmentLeaf(Integer id, String financial_department) {
        this.id = id;
        this.name = financial_department;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}
