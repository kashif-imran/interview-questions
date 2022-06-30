package interview_programs;

import java.util.Optional;

public class OptionalUseCase {
    public static void main(String[] args) {
        String firstName = null;
        /*
        If we do Optional.of(null) you will get NPE to avoid this you must use Optional.nullable

        Optional<String> firstNameOptional = Optional.ofNullable(firstName);
        if(firstNameOptional.isPresent()) {
            System.out.println(firstNameOptional.get());
        }*/

         /*firstNameOptional.map(n -> firstNameOptional + " imran")
        .orElseThrow(RuntimeException::new);*/


        Optional<String> firstNameOptional = Optional.ofNullable(firstName); // this prevents NPE
        if(firstNameOptional.isPresent()) {
            System.out.println(firstNameOptional.get());
        }

        /*
        Present in java 9
        firstNameOptional.ifPresentOrElse(n -> System.out.println("Name is " + n), () -> System.out.println("Name is not present"));
        */
    }
}
