package na.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArresrtDemo {

    // 判断a和b是否相等
    @Test
    public void assertTest(){
        String a = "123";
        String b = "123";
//        if (a.equals(b)){
//            System.out.println("a = b");
//        }else {
//            System.out.println("a != b");
//        }
//        Assert.assertEquals(a,b,"a!=b");
        // a参数是实际结果 b是预期结果
        // Assert.assertEquals(a,b) 是校验a和b是否相等
        Assert.assertEquals(a,b);
    }

    @Test
    public void assertNoEqualTEst(){
        int a = 1;
        int b = 2;
        // 校验 a 和 b不相等
        Assert.assertNotEquals(a,b,"a=b了啊");
    }

    @Test
    public void assertNull(){
        String a = null;
        String b = null;
        // 验证 a 为空
        Assert.assertNull(a);
    }

    @Test
    public void assertNoNull(){
        String a = "1";
        Assert.assertNotNull(a);
    }

    @Test
    public void atoFalse(){
        Boolean a = false;
        // 验证a 为false
        Assert.assertFalse(a);
    }

}

