import org.example.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {
    @Test
    void test(){
        String name = "Stepan";
        String username = "Zdjor";
        int age = 33;
        User user = new User(19,"Stepan","Zdjor");

        assertNotEquals(age,user.getAge());
        assertEquals(name, user.getName());
        assertEquals(username, user.getUsername());
    }
}
