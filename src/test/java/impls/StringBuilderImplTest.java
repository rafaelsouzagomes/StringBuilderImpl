package impls;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBuilderImplTest {

	@Test
	public void testStringBuilderAppendMethod() {
		StringBuilderImpl str = new StringBuilderImpl("teste");
		str.append("1");
		assertEquals("teste1", str.toString());
		
		StringBuilderImpl str2= new StringBuilderImpl();
		str2.append("Hello");
		assertEquals("Hello", str2.toString());
		
	}
	
}
