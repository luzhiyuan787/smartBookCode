package staticProxy;

/**
 * 静态代理
 * Created by luzhiyuan on 2018/8/22.
 */
public class HelloProxy implements Hello{

    private Hello hello;

    public HelloProxy() {
        hello =new HelloImpl();
    }

    @Override
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    private void before(){
        System.out.println("Before");
    }

    private void after(){
        System.out.println("After");
    }

    public static void main(String[] args) {
        HelloProxy helloProxy = new HelloProxy();
        helloProxy.say("liming ");
    }
}
