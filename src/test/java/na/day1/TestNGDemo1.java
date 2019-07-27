package na.day1;

import org.testng.annotations.*;

public class TestNGDemo1 {

    // 会在所有Test运行之前运行一次
    @BeforeTest
    public void berforTest() {
        System.out.println("BeforeTest注解");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest注解");
    }

    // 在每个Test运行之前都会运行一次
    @BeforeMethod
    public void beforMethod() {
        System.out.println("BeforeMethod注解");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod注解");
    }


    // 一个@Test就是一条测试用例
    @Test
    public void testCase1() {
        System.out.println("testCase1");
    }

    @Test
    public void testCase2() {
        System.out.println("testCase2");
    }

    @Test
    public void testCase3() {
        System.out.println("testCase3");
    }

    @Test
    public void testCase4() {
        System.out.println("testCase4");
    }

    public static void a() {
        System.out.println("这个是方法a");
    }

    public void b() {
        System.out.println("方法b");
    }
}
