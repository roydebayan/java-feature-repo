package org.generics.lex;

public class Employee {

    final private String company;


    public Employee(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Company: " + company;
    }
}
