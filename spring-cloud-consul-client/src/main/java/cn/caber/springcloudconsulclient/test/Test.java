package cn.caber.springcloudconsulclient.test;

import cn.caber.springcloudconsulclient.lock.Lock;
import cn.caber.springcloudconsulclient.runnable.TicketRunnable;
import com.ecwid.consul.v1.ConsulClient;


public class Test {
    public static void main(String[] args) {

        ConsulClient consulClient = new ConsulClient("172.16.101.115", 8500);
        Lock lock = new Lock(consulClient, "testSession", "testLock");
        TicketRunnable ticketRunnable = new TicketRunnable(200, lock);
        Thread t1 = new Thread(ticketRunnable, "窗口1");
        Thread t2 = new Thread(ticketRunnable, "窗口2");
        t1.start();
        t2.start();


    }

}
