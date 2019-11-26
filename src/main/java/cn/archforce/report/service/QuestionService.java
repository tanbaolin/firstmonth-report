package cn.archforce.report.service;

import cn.archforce.report.dto.QuestionDTO;
import cn.archforce.report.mapper.QuestionMapper;
import cn.archforce.report.mapper.UserMapper;
import cn.archforce.report.model.Question;
import cn.archforce.report.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: tanbaolin
 * @Date: Created in 2:03 下午 2019/11/26
 * @Description:
 * @Modified By:
 */
@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {

        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();

        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}
