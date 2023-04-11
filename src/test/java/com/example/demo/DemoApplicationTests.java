//package com.example.demo;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.hamcrest.Matchers.hasSize;
//import static org.hamcrest.Matchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class DemoApplicationTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	public void testGetProgramsEndpoint() throws Exception {
//		mockMvc.perform(get("/api/programs"))
//				.andExpect(status().isOk())
//				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
//				.andExpect(jsonPath("$", hasSize(2)))
//				.andExpect(jsonPath("$[0].id", is(1)))
//				.andExpect(jsonPath("$[0].name", is("Program 1")))
//				.andExpect(jsonPath("$[1].id", is(2)))
//				.andExpect(jsonPath("$[1].name", is("Program 2")));
//	}
//
//	@Test
//	public void testGetClipsEndpoint() throws Exception {
//		mockMvc.perform(get("/api/clips?programId=1"))
//				.andExpect(status().isOk())
//				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
//				.andExpect(jsonPath("$", hasSize(3)))
//				.andExpect(jsonPath("$[0].id", is(1)))
//				.andExpect(jsonPath("$[0].title", is("Clip 1")))
//				.andExpect(jsonPath("$[0].description", is("Clip 1 description")))
//				.andExpect(jsonPath("$[1].id", is(2)))
//				.andExpect(jsonPath("$[1].title", is("Clip 2")))
//				.andExpect(jsonPath("$[1].description", is("Clip 2 description")))
//				.andExpect(jsonPath("$[2].id", is(3)))
//				.andExpect(jsonPath("$[2].title", is("Clip 3")))
//				.andExpect(jsonPath("$[2].description", is("Clip 3 description")));
//	}
//}

package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGetProgramsEndpoint() throws Exception {
		mockMvc.perform(get("/api/programs"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(2)))
				.andExpect(jsonPath("$[0].id", is(1)))
				.andExpect(jsonPath("$[0].name", is("Program 1")))
				.andExpect(jsonPath("$[1].id", is(2)))
				.andExpect(jsonPath("$[1].name", is("Program 2")));
	}

	@Test
	public void testGetClipsEndpoint() throws Exception {
		mockMvc.perform(get("/api/clips?programId=1"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$[0].id", is(1)))
				.andExpect(jsonPath("$[0].title", is("Clip 1")))
				.andExpect(jsonPath("$[0].description", is("Clip 1 description")))
				.andExpect(jsonPath("$[1].id", is(2)))
				.andExpect(jsonPath("$[1].title", is("Clip 2")))
				.andExpect(jsonPath("$[1].description", is("Clip 2 description")))
				.andExpect(jsonPath("$[2].id", is(3)))
				.andExpect(jsonPath("$[2].title", is("Clip 3")))
				.andExpect(jsonPath("$[2].description", is("Clip 3 description")));
	}
}
