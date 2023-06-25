package dev.ilkka.bucketlist

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {
    @Autowired private lateinit var template: TestRestTemplate

    @Test
    fun getHello() {
        val response = template.getForEntity("/", String::class.java)
        assertThat(response.getBody()).isEqualTo("Moro!")
    }
}
