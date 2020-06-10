package cotn.photoapp.model;

import java.util.Date;

/**
 * @author kaustavbasu
 * @Date 6/4/20
 * @Time 10:50 PM
 */
public class UserDetails {

    private int uid;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;

    public UserDetails() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
