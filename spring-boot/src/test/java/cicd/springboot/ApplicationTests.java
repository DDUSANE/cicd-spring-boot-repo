package cicd.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cicd.springboot.controller.CICDController;

@SpringBootTest
class ApplicationTests {
	
	

	@Test
	void contextLoads() {
	}
	
	@Autowired
    CICDController service;

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void testGet() {
        assertEquals("Hi ! This is just test message.", service.showMessage());
    }

}
