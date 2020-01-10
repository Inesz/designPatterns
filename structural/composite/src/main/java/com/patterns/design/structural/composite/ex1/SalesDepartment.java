package com.patterns.design.structural.composite.ex1;

public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public SalesDepartment(Integer id, String sales_department) {
        this.id = id;
        this.name = sales_department;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters

}
