package functional_interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class DemoOfJunit5 {
    @Test
    @DisplayName("Test for computeIfAbsent Java 8 feature of Map interface")
    void computeIfAbsent() {
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", (s) -> s.length());

        assertEquals(4, value);
    }


}
