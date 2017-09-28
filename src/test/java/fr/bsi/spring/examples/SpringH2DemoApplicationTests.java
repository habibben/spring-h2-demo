package fr.bsi.spring.examples;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(value = "test")
public class SpringH2DemoApplicationTests {

	@Autowired
	private PersonDao personDao;

	@Test
	public void contextLoads() {

		List<Person> all = personDao.findAll();
		Assertions.assertThat(all).isNotEmpty();
	}

}
