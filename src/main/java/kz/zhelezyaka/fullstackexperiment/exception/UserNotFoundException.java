package kz.zhelezyaka.fullstackexperiment.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not found the User with id: " + id);
    }
}
