package main;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Table("branch")
public class Branch {
    int number;
    public String name;
    public double area;
    public String status;
}

@Repository
interface BranchRepository extends CrudRepository<Branch, Integer> { }