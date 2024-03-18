//package com.crio.coderhack.controller;
//
//import net.minidev.json.JSONObject;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.web.util.NestedServletException;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class UserControllerIntegrationTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void testRegisterUser() throws Exception {
//        String username = "testUser";
//
//        JSONObject requestJson = new JSONObject();
//        requestJson.put("username", username);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/users")
//                        .content(requestJson.toJSONString())
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.username").value(username));
//    }
//
//    @Test
//    public void testGetUserById() throws Exception {
//        String userId = "123";
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/users/{userId}", userId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.userId").value(userId));
//    }
//
//    @Test
//    public void testGetNonExistentUserById() throws Exception {
//        String nonExistentUserId = "nonExistentId";
//
//        try {
//            mockMvc.perform(MockMvcRequestBuilders.get("/users/{userId}", nonExistentUserId))
//                    .andExpect(MockMvcResultMatchers.status().isNotFound());
//        } catch (NestedServletException e) {
//            // Verify that the exception is caused by UserNotFoundException
//            Throwable rootCause = e.getRootCause();
//            assertEquals(com.crio.coderhack.exception.UserNotFoundException.class, rootCause.getClass());
//        }
//    }
//}
