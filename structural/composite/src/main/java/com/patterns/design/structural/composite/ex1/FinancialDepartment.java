package com.patterns.design.structural.composite.ex1;

public class FinancialDepartment implements Department {

    private Integer id;
    private String name;

    public FinancialDepartment(Integer id, String financial_department) {
        this.id = id;
        this.name = financial_department;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}
