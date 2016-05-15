import static org.junit.Assert.*;

import org.junit.Test;

import com.polatoglu.example.HelloWorld;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld hello = new HelloWorld();
		String helloString = hello.getHelloWorld();
		assertEquals("String is not the same!!", "Hello World!!", helloString);
	}

}
