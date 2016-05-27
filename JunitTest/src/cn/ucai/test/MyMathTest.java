package cn.ucai.test;

// 静态导入
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 单元测试，针对方法
 */
public class MyMathTest {
	private MyMath math = new MyMath();
	// 标注
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before  //  表示每次@Test的方法执行前都会调用的方法
	public void setUp() throws Exception {
		// 完成初始化工作
		math.clear();
	}

	@After  // 收尾工作
	public void tearDown() throws Exception {
	}

	@Test  // 这是一个测试方法
	public void testAdd() {
		math.add(2);
		math.add(3);
		// 断言
		assertEquals(5, math.getResult());
	}

	@Test
	public void testSubstract() {
		math.add(10);
		math.substract(2);
		assertEquals(8, math.getResult());
	}

	@Ignore
	@Test
	public void testMultiply() {
		math.add(1);
		math.multiply(2);
		math.multiply(3);
		assertEquals(6, math.getResult());
	}

	
	@Test(timeout=2000)
	public void testMethod() {
		math.squareRoot(4);
		assertEquals(2, math.getResult());
	}

}
