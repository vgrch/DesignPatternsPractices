package az.vgrch.practice.creational.prototype;

public class TestPrototype {

    public static void main(String[] args) {
        User user = new User();
        User clonedUser = null;
        user.setName("Vugar");
        user.setSurname("Asadov");
        user.setEmail("vgr.asadov@gmail.com");
        user.setPassword("password");
        System.out.println(user);

        try {
           clonedUser = (User) user.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        clonedUser.setPassword("new password");
        System.out.println(clonedUser);
    }
}
