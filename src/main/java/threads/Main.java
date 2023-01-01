package threads;

public class Main {
    public static void main(String[] argv) throws InterruptedException{

//        Ordinary Thread
//        Task task = new Task();
//        task.start();
//
//        for (int doc=0; doc<=10; doc++) {
//            System.out.println("Doc #2: " + doc);
//        }


//        Multi-Threading
        Task1 task1 = new Task1();
        Thread thread1 = new Thread(task1);
        thread1.start();

        Task2 task2 = new Task2();
        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}
