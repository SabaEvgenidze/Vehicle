package interfacepack;

@FunctionalInterface //when an interface has only one abstract method we can say that it is a functional interface
public interface IAttack {
    public void attack(String name);
}
