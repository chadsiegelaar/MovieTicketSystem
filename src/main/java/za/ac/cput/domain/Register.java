package za.ac.cput.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Register implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String cellNumber;
    private String username;
    private String password;

    protected Register(){}

    public Register(Register.Builder builder)
    {
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
        this.cellNumber = builder.cellNumber;
        this.username = builder.username;
        this.password = builder.password;
    }

    public int getId(){
        return id;
    }
    public String getfirstname()
    {
        return firstname;
    }
    public String getlastname() {return lastname;}
    public String getemail()
    {
        return email;
    }
    public String getcellNumber()
    {
        return cellNumber;
    }
    public String getusername()
    {
        return username;
    }
    public String getpassword()
    {
        return password;
    }

    public static class Builder
    {
        private int id;
        private String firstname;
        private String lastname;
        private String email;
        private String cellNumber;
        private String username;
        private String password;



        public Register.Builder setId(int id)
        {
            this.id = id;
            return this;
        }
        public Register.Builder setfirstname(String firstname)
        {
            this.firstname = firstname;
            return this;
        }
        public Register.Builder setlastname(String lastname)
        {
            this.lastname = lastname;
            return this;
        }
        public Register.Builder setemail(String email)
        {
            this.email = email;
            return this;
        }
        public Register.Builder setcellNumber(String cellNumber)
        {
            this.cellNumber = cellNumber;
            return this;
        }
        public Register.Builder setusername(String username)
        {
            this.username = username;
            return this;
        }

        public Register.Builder setpassword(String password)
        {
            this.password = password;
            return this;
        }

        public Register.Builder copy(Register register)
        {
            this.firstname = register.firstname;
            this.lastname = register.lastname;
            this.email = register.email;
            this.cellNumber = register.cellNumber;
            this.username = register.username;
            this.password = register.password;
            return this;
        }

        public Register build()
        {
            return new Register(this);
        }
    }
}


