package threads;

public class Main {
    public static void main(String[] argv){
        Runnable r = new Task();
        Thread  task = new Thread(r);
        task.start();

        for (int doc=1; doc<=10; doc++){
            System.out.println("^^ Doc #: " + doc);
        }
    }
}