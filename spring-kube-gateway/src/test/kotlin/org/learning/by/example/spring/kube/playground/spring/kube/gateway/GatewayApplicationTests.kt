package org.learning.by.example.spring.kube.playground.spring.kube.gateway

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
@ActiveProfiles("test")
class GatewayApplicationTests {

  @Test
  fun contextLoads() {
  }

}

