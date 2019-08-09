package pattern2;

/**
 *  工厂模式
 */
public class Client {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new GDCompFac();
        Levon levon = computerFactory.createComputer(Levon.class);
        levon.start("leov");
    }
}
