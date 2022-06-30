package threads.threadsLocal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SharedMapTest {

    //public static void test()  JUnit doesn'nt recognise static methods
    @Test
    public void test() {
        SharedMapWithUserContext firstUser = new SharedMapWithUserContext(1);
        SharedMapWithUserContext secondUser = new SharedMapWithUserContext(2);
        new Thread(firstUser).start();
        new Thread(secondUser).start();

        assertEquals(SharedMapWithUserContext.userContextPerUserId.size(), 2);
    }
}
