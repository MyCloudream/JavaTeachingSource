package cn.ucai.test;

// ��̬����
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * ��Ԫ���ԣ���Է���
 */
public class MyMathTest {
	private MyMath math = new MyMath();
	// ��ע
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before  //  ��ʾÿ��@Test�ķ���ִ��ǰ������õķ���
	public void setUp() throws Exception {
		// ��ɳ�ʼ������
		math.clear();
	}

	@After  // ��β����
	public void tearDown() throws Exception {
	}

	@Test  // ����һ�����Է���
	public void testAdd() {
		math.add(2);
		math.add(3);
		// ����
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
