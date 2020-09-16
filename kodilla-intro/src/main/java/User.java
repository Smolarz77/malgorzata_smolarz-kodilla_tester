public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static double average(User[] user) {
        int i = 0;
        int ageSum = 0;

        while (i < user.length) {
            ageSum += user[i].age;
            i++;
        }

        return ageSum / user.length;
    }

    public static void main(String[] args) {
        User[] user = new User[5];

        user[0] = new User("Gosia", 43);
        user[1] = new User("Karol", 30);
        user[2] = new User("Zofia", 72);
        user[3] = new User("Anna", 56);
        user[4] = new User("Jochen", 71);

        double average = average(user);

        for (int i = 0; i < user.length; i++) {
            if (user[i].age < average)
            {
                System.out.println(user[i].name);
            }

        }
    }
}

