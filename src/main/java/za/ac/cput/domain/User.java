package za.ac.cput.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String password;

    protected User(){}

    public User(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.password = builder.password;
    }
    public int getId(){
        return id;
    }
    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public static class Builder
    {
        private int id;
        private String name;
        private String password;

        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder setPassword(String password)
        {
            this.password = password;
            return this;
        }

        public Builder setId(int id)
        {
            this.id = id;
            return this;
        }

        public Builder copy(User user)
        {
            this.id = user.id;
            this.name = user.name;
            this.password = user.password;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
