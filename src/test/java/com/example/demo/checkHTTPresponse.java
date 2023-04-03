//package com.example.demo;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//
//@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class checkHTTPresponse {
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate testRestTemplate;
//
//    @Test
//    public void shouldPassIfSringMatches() {
//        assertEquals( expected: "hello  world from spring boot",
//                testRestTemplate.getForObject( url: "http://localhost:" + port + "/" ,
//                String.class));
//    }
//}
