package top.codecly.api.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import top.codecly.api.Application;

/**
 * @ClassName HtmlControllerTest
 * @Description TODO
 * @Author maxinchun
 * @Date 2018/8/19 11:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)//这里的Appliction是Springboot的启动类名
@WebAppConfiguration
public class HtmlControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;


    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void titleTest() throws Exception {
        String url = "https://www.cnblogs.com/shunyang/p/8681111.html";
        mockMvc.perform(MockMvcRequestBuilders.get("/html/title")
                    .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                    .param("url", url))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.jsonPath("code").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("code").value(0));

    }

}
