package test.com.yxc.javacore.day12.lesson.abstractdemo;

import com.yxc.javacore.day12.lesson.abstractdemo.Circular;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Circular Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮһ�� 25, 2018</pre>
 */
public class CircularTest {

    @Before
    public void before() throws Exception {
        System.out.println("单元测试开始！");
    }

    @After
    public void after() throws Exception {
        System.out.println("单元测试结束！");
    }

    /**
     * Method: getPerimeter()
     */
    @Test
    public void testGetPerimeter() throws Exception {
        Circular circular = new Circular();
        circular.getPerimeter();
    }

} 
