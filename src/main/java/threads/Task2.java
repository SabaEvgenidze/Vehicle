package threads;

import org.apache.log4j.Logger;

public class Task2 extends ForThread implements Runnable{
    private static final Logger LOGGER= Logger.getLogger(Task2.class);

    @Override
    public void run(){
        for (int i=0; i<=10; i++){
            LOGGER.info("Thread #2: " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        LOGGER.info("Thread #2 finished! ");
    }
}
