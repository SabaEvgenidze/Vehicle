package threads;

public class Task extends ForThread implements Runnable {

    @Override
    public void run(){
        for (int doc=1; doc<=10; doc++){
            System.out.println("Doc #: " + doc);
        }
    }
}
