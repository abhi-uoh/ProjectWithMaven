package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project {

    @Id

    private int pid;

    @Column(name = "Project_Name")
    private String name;

    public Project(int pid, String name, List<Employee> emps) {
        this.pid = pid;
        this.name = name;
        this.emps = emps;
    }

    @ManyToMany(mappedBy = "projects")
    private List<Employee> emps;


    public Project() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", emps=" + emps +
                '}';
    }
}
