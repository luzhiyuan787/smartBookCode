package staticProxy;

/**
 * Created by luzhiyuan on 2018/8/22.
 */
public class HelloImpl implements Hello {

    @Override
    public void say(String name){
        System.out.println("staticProxy.Hello! "+name);
    }
}
