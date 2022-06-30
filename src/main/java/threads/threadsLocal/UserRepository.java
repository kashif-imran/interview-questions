package threads.threadsLocal;

public class UserRepository {
    public String getUserNameForUserId(Integer userId) {
        if(userId.equals(1)) {
            return "kashif";
        } else {
            return "imran";
        }
    }
}
