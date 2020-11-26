package cn.caber.springcloudconsulclient.runnable;

import cn.caber.springcloudconsulclient.lock.DistributedLock;
import cn.caber.springcloudconsulclient.lock.Lock;
import lombok.SneakyThrows;
import org.apache.commons.lang.StringUtils;

public class TicketRunnable1 implements Runnable {

    private int ticketNum;
    private DistributedLock lock;

    public TicketRunnable1(int ticketNum, DistributedLock lock) {
        this.ticketNum = ticketNum;
        this.lock = lock;
    }


    @SneakyThrows
    @Override
    public void run() {
        String session = "";
        try {

            DistributedLock.LockContext lockContext = lock.getLock("testLockName", 30);
            boolean getLock = lockContext.isGetLock();
            session= lockContext.getSession();
            if (getLock) {
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
            if(StringUtils.isNotBlank(session)){
                lock.releaseLock(session);
            }
        }
    }


}
