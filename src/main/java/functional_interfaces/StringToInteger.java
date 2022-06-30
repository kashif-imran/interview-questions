package functional_interfaces;

@FunctionalInterface
public interface StringToInteger {
    Integer applyAsInteger(String val);
}