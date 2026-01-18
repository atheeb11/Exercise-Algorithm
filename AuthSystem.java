import java.util.ArrayList;
import java.util.Arrays;

public class AuthSystem {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>(Arrays.asList("admin", "budi", "nugraha", "user1", "guest"));
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("123", "passBudi", "nug123", "secret", "hello"));

        String inputUser = "nugraha";
        String inputPass = "nug123";
        boolean isValid = false;

        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(inputUser) && passwords.get(i).equals(inputPass)) {
                isValid = true;
                break;
            }
        }

        if (isValid) {
            System.out.println("username and password valid, you can login into the dashboard");
        } else {
            System.out.println("Wrong username and password");
        }
    }
}