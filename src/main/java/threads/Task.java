package threads;

public class Task extends Thread{
    @Override
    public void run(){
        for (int doc=0; doc<=10; doc++){
            System.out.println("Doc #1: " + doc);
        }
    }
}
