package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hrms_hrdepartment")
public class HrmsHrDepartment {

    @Id
    @Column(name = "empl_id")
    private int employeeId;

    @Column(name = "hrdp_role")
    private String role;

    @Column(name = "hrdp_desc")
    private String description;

    // Constructors, getters, and setters

    public HrmsHrDepartment() {
        // Default constructor
    }

    public HrmsHrDepartment(String role, String description) {
        this.role = role;
        this.description = description;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
