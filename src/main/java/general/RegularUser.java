package general;

import lombok.Data;

import static utils.RandomGenerator.generateRandomEmail;
import static utils.RandomGenerator.generateRandomPhoneNumber;
import static utils.RandomGenerator.generateRandomString;

@Data
public class RegularUser {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//    private String firstName;
//    private String lastName;
//public User() {
//    this.firstName = generateRandomString();
//    this.lastName = generateRandomString();
//}

}
