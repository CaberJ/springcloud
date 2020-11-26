package cn.caber.springcloudconsulclient.runnable;

import cn.caber.springcloudconsulclient.lock.Lock;
import lombok.SneakyThrows;

public class TicketRunnable implements Runnable {

    private int ticketNum;
    private Lock lock;

    public TicketRunnable(int ticketNum, Lock lock) {
        this.ticketNum = ticketNum;
        this.lock = lock;
    }



    @SneakyThrows
    @Override
    public void run() {
        Boolean lock = this.lock.lock(true);
        try {
            if(lock) {
                while (ticketNum > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticketNum--;
                    System.out.println(Thread.currentThread().getName() + "还有" + ticketNum + "张票");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.lock.unlock();
        }
    }


}
