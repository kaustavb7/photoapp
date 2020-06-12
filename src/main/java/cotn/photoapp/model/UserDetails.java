package cotn.photoapp.model;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author kaustavbasu
 * @Date 6/4/20
 * @Time 10:50 PM
 */
public class UserDetails {

    private int uid;
    @NotBlank(message = "FirstName is mandatory")
    @Size(min = 2, message = "name should be more than 2 character")
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    @NotBlank(message="Email cannot be empty")
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



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
