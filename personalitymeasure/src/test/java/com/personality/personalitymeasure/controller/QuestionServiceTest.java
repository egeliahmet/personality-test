package com.personality.personalitymeasure.controller;
import com.personality.personalitymeasure.model.QuestionDto;
import com.personality.personalitymeasure.model.QuestionList;
import com.personality.personalitymeasure.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;

@WebMvcTest(QuestionController.class)
public class QuestionServiceTest {

  /*  @Autowired
    private MockMvc mockMvc;

    @MockBean
    private QuestionService service;
    private QuestionList questionList;
    private String response;

    public void setup(){
         questionList=new QuestionList();
        QuestionDto questionDto=new QuestionDto(1L," name",1L, " ",false,null);
        List<QuestionDto> questionDtos=new ArrayList<>();
        questionDtos.add(questionDto);
        questionList.setQuestionList(questionDtos);
        response="{\"categoryDtoList\":[{\"id\":1,\"name\":\" name\",\"description\":\"desc\"},{\"id\":1,\"name\":\" name\",\"description\":\"desc\"}]}";
    }

    @Test
    public void shouldReturnQuestions() throws Exception {
        setup();
        when(service.getQuestions(any())).thenReturn(questionList);
        this.mockMvc.perform(get("/api/v1/questions?categoryId=2")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(response));
    }
*/
}
