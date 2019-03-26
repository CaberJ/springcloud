package cn.caber.springcloudribbonconsumer;



import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixThreadPoolKey;


public class MyHystrixProperty extends HystrixCommand<String> {

    protected MyHystrixProperty(HystrixCommandGroupKey group) {
        super(group);
    }

    protected MyHystrixProperty(HystrixCommandGroupKey group, HystrixThreadPoolKey threadPool) {
        super(group, threadPool);
    }

    protected MyHystrixProperty(HystrixCommandGroupKey group, int executionIsolationThreadTimeoutInMilliseconds) {
        super(group, executionIsolationThreadTimeoutInMilliseconds);
    }

    protected MyHystrixProperty(HystrixCommandGroupKey group, HystrixThreadPoolKey threadPool, int executionIsolationThreadTimeoutInMilliseconds) {
        super(group, threadPool, executionIsolationThreadTimeoutInMilliseconds);
    }

    protected MyHystrixProperty(Setter setter) {
        super(setter);
    }

    @Override
    protected String run() throws Exception {
        return null;
    }
}
