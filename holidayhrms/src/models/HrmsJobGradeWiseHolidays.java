package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hrms_jobgradewiseholidays")
public class HrmsJobGradeWiseHolidays {

    @Id
    @Column(name = "jbgr_id")
    private int id;

    @Column(name = "jbgr_totalnoh")
    private int totalHolidays;

    @ManyToOne
    @JoinColumn(name = "jbgr_id", referencedColumnName = "jbgr_id", foreignKey = @ForeignKey(name = "FK_JobGradeWiseHolidays_JobGrades"))
    private JobGrade jobGrade;

    // Constructors, getters, and setters

    public HrmsJobGradeWiseHolidays() {
        // Default constructor
    }

    public HrmsJobGradeWiseHolidays(int totalHolidays, JobGrade jobGrade) {
        this.totalHolidays = totalHolidays;
        this.jobGrade = jobGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalHolidays() {
        return totalHolidays;
    }

    public void setTotalHolidays(int totalHolidays) {
        this.totalHolidays = totalHolidays;
    }

    public JobGrade getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(JobGrade jobGrade) {
        this.jobGrade = jobGrade;
    }
}
