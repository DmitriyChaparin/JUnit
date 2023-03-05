import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldCheckUserCreationWithParameters() {
        String login = "login";
        String email = "email";
        User user = new User(login, email);
        Assertions.assertEquals("login", user.getLogin());
        Assertions.assertEquals("email", user.getEmail());
    }

    @Test
    void shouldCheckUserCreationWithoutParameters() {
        User user = new User();
        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }


    @Test
    void shouldCheckNoEqualityLoginAndEmail() {
        String login = "login";
        String email = "email";
        User user = new User(login, email);
        Assertions.assertTrue(user.noEqualityLoginAndEmail(login, email));
    }

    @Test
    void shouldValidUserEmail() {
        String email = "example@email.com";
        String login = "login";
        User user = new User(login, email);
        Assertions.assertTrue(user.validEmail(user.getEmail()));
    }
}