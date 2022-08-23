package main;

import org.springframework.data.relational.core.mapping.Table;

@Table("branch")
public class Branch {
    int number;
    public String name;
    public double area;
    public String status;
}