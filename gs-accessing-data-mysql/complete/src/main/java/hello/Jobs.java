package hello;

/**
 * Created by JMYE on 6/20/17.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Jobs {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String jtitle;

    private String jtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getjobTitle() {
        return jtitle;
    }

    public void setjobTitle(String jobTitle) {
        this.jtitle = jobTitle;
    }

    public String getjobType() {
        return jtype;
    }

    public void setjobType(String jobType) {
        this.jtype = jobType;
    }


}

