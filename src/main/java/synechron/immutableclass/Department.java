package synechron.immutableclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private final int id;
    private final String name;

    Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
