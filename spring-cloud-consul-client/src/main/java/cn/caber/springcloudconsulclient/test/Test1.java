package cn.caber.springcloudconsulclient.test;

import cn.caber.springcloudconsulclient.lock.DistributedLock;
import cn.caber.springcloudconsulclient.lock.Lock;
import cn.caber.springcloudconsulclient.runnable.TicketRunnable;
import cn.caber.springcloudconsulclient.runnable.TicketRunnable1;
import com.ecwid.consul.v1.ConsulClient;


public class Test1 {
    public static void main(String[] args) {

        DistributedLock distributedLock = new DistributedLock("172.16.101.115", 8500);
        TicketRunnable1 ticketRunnable = new TicketRunnable1(200,distributedLock);
        Thread t1 = new Thread(ticketRunnable, "窗口1");
        Thread t2 = new Thread(ticketRunnable, "窗口2");
        t1.start();
        t2.start();


    }

}
