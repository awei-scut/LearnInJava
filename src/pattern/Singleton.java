package pattern;

/**
 * 单例模式 饿汉
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }
    public static void main(String[] args) {

    }
}
