package threads.threadsLocal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// We want to have one thread per user id.
// We'll create a SharedMapWithUserContext class that implements the Runnable interface.
// The implementation in the run() method calls some database through the UserRepository class that returns a Context object for a given userId.
public class SharedMapWithUserContext implements Runnable {

    //Next, we store that context in the ConcurentHashMap keyed by userId:
    public static Map<Integer, Context> userContextPerUserId
            = new ConcurrentHashMap<>();
    private Integer userId;
    private UserRepository userRepository = new UserRepository();

    public SharedMapWithUserContext(Integer userId) {
        this.userId = userId;
    }

    @Override
    public void run() {
        String userName = userRepository.getUserNameForUserId(userId);
        userContextPerUserId.put(userId, new Context(userName));
    }

    // standard constructor
}