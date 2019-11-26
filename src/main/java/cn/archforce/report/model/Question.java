package cn.archforce.report.model;

import lombok.Data;

/**
 * @Author: tanbaolin
 * @Date: Created in 10:30 上午 2019/11/26
 * @Description:
 * @Modified By:
 */
@Data
public class Question {
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

}
