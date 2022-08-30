package za.ac.cput.domain;

public class User
{
    private String name;
    private String password;

    public User(Builder builder)
    {
        this.name = builder.name;
        this.password = builder.password;
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

        public Builder copy(User user)
        {
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
