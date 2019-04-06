package jdk_VS_CGlib;

/**
 * 代理模式[[ 客户端--》代理对象--》目标对象 ]]
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("**********************CGLibProxy**********************");
        CGLibProxy cgLibProxy = new CGLibProxy();
        IUserManager userManager = (IUserManager) cgLibProxy.createProxyObject(new UserManagerImpl());
        userManager.addUser("lanhuigu", "123456");

        /** 只能代理实现了接口的类**/
        System.out.println("**********************JDKProxy**********************");
        JDKProxy jdkPrpxy = new JDKProxy();
        IUserManager userManagerJDK = (IUserManager) jdkPrpxy.newProxy(new UserManagerImpl());
        userManagerJDK.addUser("lanhuigu", "123456");

        /*UserTest userTest = (UserTest) jdkPrpxy.newProxy(new UserTest());
        userTest.say();*/

        System.out.println("**********************CGLibProxy-Test**********************");
        CGLibProxy cgLibProxy1 = new CGLibProxy();
        UserTest userManager1 = (UserTest) cgLibProxy1.createProxyObject(new UserTest());
        userManager1.say();
    }
}
