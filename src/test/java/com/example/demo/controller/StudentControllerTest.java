package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc //啟用MockMvc功能
@SpringBootTest
public class StudentControllerTest {
    @Autowired //注入bean mockMvc
    private MockMvc mockMvc;

    @Test
    public void getById() throws Exception { //mockMvc的perform方法會噴出一個Exception

        //使用requestBuilder設定要發起的httpRequest的相關參數
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/students/{studentId}", 3)
                .header("headerName","headerValue")
                .queryParam("graduate","true");

        //.perform()發起httpRequest
        MvcResult mvcResult=mockMvc.perform(requestBuilder)
                .andDo(print())//印出api的返回結果
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.id",equalTo(3)))
                .andExpect(jsonPath("$.name",notNullValue()))
                .andReturn();//可以取得完整的api執行結果出來 需要一個MvcResult變數去接

        String body=mvcResult.getResponse().getContentAsString();
        System.out.println("返回的 response body為: "+body);
        //.andExpect()驗證請求結果
    }

    @Test
    public void create() throws Exception {
            RequestBuilder requestBuilder = MockMvcRequestBuilders
                    .post("/students")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\n" +
                            "  \"name\":\"NingNing\",\n" +
                            "  \"score\":77.5,\n" +
                            "  \"graduate\":false\n" +
                            "}");

            mockMvc.perform(requestBuilder)
                    .andExpect(status().is(201));
    }

}