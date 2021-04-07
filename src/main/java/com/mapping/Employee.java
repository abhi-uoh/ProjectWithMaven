package com.mapping;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {

    @Id
    private int eid;
    private String name;

    public Employee(int eid, String name, List<Project> projects) {
        this.eid = eid;
        this.name = name;
        this.projects = projects;
    }

    @ManyToMany
    private List<Project>projects;

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", projects=" + projects +
                '}';
    }
}
