package cn.caber.springcloudribbonconsumer.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

public class MyRule extends AbstractLoadBalancerRule {
    private static Logger log = LoggerFactory.getLogger(MyRule.class);

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
    }

    @Override
    public Server choose(Object o) {
        Server server = null;
        ILoadBalancer lb = getLoadBalancer();
        if (lb == null) {
            log.warn("no load balancer");
            return null;
        } else {
            List<Server> reachableServers = lb.getReachableServers();
            List<Server> allServers = lb.getAllServers();
            int reachableSize = reachableServers.size();
            if (reachableSize == 0) {
                return null;
            }

            for (Server reachableServer : reachableServers) {
                Random random = new Random();
                int index = random.nextInt(reachableSize);
                server = reachableServers.get(index);
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        String hostPort = server.getHostPort();
                        log.info("ribbon 选择到的 server ; hostPost:{}", hostPort);
                        return server;
                    }
                    server = null;
                    Thread.yield();
                }
            }
            return server;
        }
    }
}