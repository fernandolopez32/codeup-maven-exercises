import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class MyFirstTest {

    @Test
    public void additionMethodTest(){
        long input1 = 20;
        long input2 = 30;
        long expected = 50;
        Assert.assertEquals(expected,MathOperations.add(input1,input2));
    }

    @Test
    public void tipAppTest(){
        double cost = 22.56;
        double tip = 20;

        Assert.assertEquals(4.51,MathOperations.tip(cost,tip),.005);
    }


}
