package org.tut;

import javax.persistence.*;

@Entity
@Table(name = "Test_table")
public class testing {

    @Id
    @GeneratedValue
    private int sno;
    @Column(name = "EMPLOYEE_NAME")
    private String name;

    public testing(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    public testing() {
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "testing{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                '}';
    }
}
