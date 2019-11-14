package ex1;

public final class Singleton {
    private static Singleton instance; //volatile see ex2
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        //Singleton result = instance; see ex2
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}