package cotn.photoapp.exception;

/**
 * @author kaustavbasu
 * @Date 6/18/20
 * @Time 2:40 AM
 */
public class UserServiceException extends RuntimeException {

    public UserServiceException(String message) {
        super(message);
    }
}
