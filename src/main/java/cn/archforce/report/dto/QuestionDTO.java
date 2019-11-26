package cn.archforce.report.dto;

import cn.archforce.report.model.User;
import lombok.Data;

/**
 * @Author: tanbaolin
 * @Date: Created in 2:00 下午 2019/11/26
 * @Description:
 * @Modified By:
 */
@Data
public class QuestionDTO {

    private Integer id;
    private String title;
    private String description;
    private String tag ;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount ;
    private Integer commentCount;
    private Integer likeCount ;
    private User user;

}
