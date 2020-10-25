import java.util.Objects;

public class User {
    private String userName;
    private int age;
    private int numberOfPosts;
    private String group;

    public User(String userName, int age, int numberOfPosts, String group) {
        this.userName = userName;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                numberOfPosts == user.numberOfPosts &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, age, numberOfPosts, group);
    }
}

