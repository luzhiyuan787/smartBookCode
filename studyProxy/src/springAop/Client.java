package springAop;

import org.springframework.aop.framework.AopConfigException;
import org.springframework.aop.framework.ProxyFactory;
import staticProxy.Hello;
import staticProxy.HelloImpl;

/**
 * Created by luzhiyuan on 2018/8/23.
 */
public class Client {
    public static void main(String[] args) throws AopConfigException {
        ProxyFactory proxyFactory = new ProxyFactory();//创建代理工厂
        proxyFactory.setTarget(new HelloImpl());//射入目标类对象
        proxyFactory.addAdvice(new HelloBeforeAdvice());//增加前置增强
        proxyFactory.addAdvice(new HelloAfterAdvice());//增加后置增强
        proxyFactory.addAdvice(new HelloAroundAdvice());//增加环绕增强
        Hello helloProxy = (Hello) proxyFactory.getProxy();//从代理工厂中获取代理
        helloProxy.say("liming");//调用代理的方法
    }
}
