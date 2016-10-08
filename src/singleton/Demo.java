package singleton;

public class Demo {
    public static void main(String[] args) {
        //illegal construct:
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
