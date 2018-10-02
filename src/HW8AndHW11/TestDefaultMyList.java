package HW8AndHW11;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class TestDefaultMyList {
	
	@Test
	public void add() {
		DefaultMyList<Integer> dm = mock(DefaultMyList.class);
		
		when(dm.get(anyInt())).thenReturn(new Object());
		
//		assertFalse(condition);
	}

	
}
