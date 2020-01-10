package com.patterns.design.structural.composite.ex2;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartmentComposite implements DepartmentComponent {
    private Integer id;
    private String name;

    private List<DepartmentComponent> childDepartments;

    public HeadDepartmentComposite(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());

        childDepartments.forEach(DepartmentComponent::printDepartmentName);
        //double colon operator ( :: )
        //childDepartments.forEach(d -> d.printDepartmentName());
    }

    public void addDepartment(DepartmentComponent department) {
        childDepartments.add(department);
    }

    public void removeDepartment(DepartmentComponent department) {
        childDepartments.remove(department);
    }
}