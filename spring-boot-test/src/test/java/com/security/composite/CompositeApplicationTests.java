package com.security.composite;

import com.security.composite.controller.MainControllerMockTest;
import com.security.composite.service.UserDetailsServiceImplMockTest;
import com.security.composite.service.UserDetailsServiceImplTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/*

@RunWith(SpringRunner.class)
@SpringBootTest
*/

@RunWith(Suite.class)
@Suite.SuiteClasses({
		MainControllerMockTest.class,
		UserDetailsServiceImplTest.class,
		UserDetailsServiceImplMockTest.class
})
public class CompositeApplicationTests {

	@Test
	public void contextLoads() {
	}

}



