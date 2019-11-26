package cn.archforce.report.mapper;

import cn.archforce.report.dto.QuestionDTO;
import cn.archforce.report.model.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: tanbaolin
 * @Date: Created in 10:27 上午 2019/11/26
 * @Description:
 * @Modified By:
 */
@Mapper
public interface QuestionMapper {


    void create(Question question);

    List<Question> list();
}
