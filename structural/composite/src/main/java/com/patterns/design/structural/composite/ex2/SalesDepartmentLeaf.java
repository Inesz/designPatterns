package com.patterns.design.structural.composite.ex2;

public class SalesDepartmentLeaf implements DepartmentComponent {

    private Integer id;
    private String name;

    public SalesDepartmentLeaf(Integer id, String sales_department) {
        this.id = id;
        this.name = sales_department;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters

}
