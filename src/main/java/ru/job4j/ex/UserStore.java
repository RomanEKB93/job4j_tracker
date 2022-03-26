package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
               return user;
            }
        }
        throw new UserNotFoundException("User with login "
                + login + " is not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        String username = user.getUsername();
        if (username.length() < 3 || !user.isValid()) {
            throw new UserInvalidException("User " + username + " is invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException env) {
            System.out.println("Exception is catched: " + env);
        } catch (UserNotFoundException enf) {
            System.out.println("Exception is catched: " + enf);
        }
    }
}
