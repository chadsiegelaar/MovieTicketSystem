package za.ac.cput.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;
@JsonDeserialize
@Entity
public class Register implements Serializable {

    @Id
    @Basic (optional = false)
    private String FirstName;
    private String LastName;
    private String Email;
    private String CellNumber;
    private String Username;
    private String Password;

    public Register(String firstname, String lastname, String email, String cellNumber, String username, String password) {
        FirstName = firstname;
        LastName = lastname;
        Email = email;
        CellNumber = cellNumber;
        Username = username;
        Password = password;

    }

    private Register(Builder builder) {
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.Email = builder.Email;
        this.CellNumber = builder.CellNumber;
        this.Username = builder.Username;
        this.Password = builder.Password;
    }

    public Register() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setCellNumber(String cellNumber) {
        CellNumber = cellNumber;
    }

    public String getCellNumber() {
        return CellNumber;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String lastName) {
        Username = lastName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String lastName) {
        Password = lastName;
    }

    @Override
    public String toString() {
        return "Register{" +
                "id="  +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", CellNumber='" + CellNumber + '\'' +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    //Implementing Builder Pattern
    public static class Builder {
        public int Id;
        private String FirstName;
        private String LastName;
        private String Email;
        private String CellNumber;
        private String Username;
        private String Password;


        public Register.Builder setFirstName(String firstName) {
            this.FirstName = firstName;
            return this;
        }

        public Register.Builder setLastName(String lastName) {
            this.LastName = lastName;
            return this;
        }

        public Register.Builder setEmail(String email) {
            this.Email = email;
            return this;
        }

        public Register.Builder setCellNumber(String cellNumber) {
            this.CellNumber = cellNumber;
            return this;
        }

        public Register.Builder setUsername(String username) {
            this.Username = username;
            return this;
        }

        public Register.Builder setPassword(String password) {
            this.Password = password;
            return this;
        }

        public Register.Builder copy(Register register) {
            this.FirstName = register.FirstName;
            this.LastName = register.LastName;
            this.Email = register.Email;
            this.CellNumber = register.CellNumber;
            this.Username = register.Username;
            this.Password = register.Password;
            return this;
        }

        public Register build() {
            return new Register(this);
        }
    }
}



