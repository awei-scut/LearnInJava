package pattern2;

public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clz);
}
