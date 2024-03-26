package bp.ci;


import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void test1() {
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Assert.assertTrue(true);
    }

    @Test
    public void test3() {
        Assert.assertTrue(true);
    }

    @Test
    public void test4() {
        Assert.assertTrue(true);
    }

    @Test
    public void test5() throws InterruptedException {
        System.out.println("Intense testing");
        Thread.sleep(5000);
        System.out.println("Intensified testing");
        Assert.assertFalse(false);
    }
}