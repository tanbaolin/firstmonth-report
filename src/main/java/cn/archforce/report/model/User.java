package cn.archforce.report.model;

import lombok.Data;
import lombok.Value;

/**
 * @Author: tanbaolin
 * @Date: Created in 5:12 下午 2019/11/25
 * @Description:
 * @Modified By:
 */
@Data
public class User {

    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}
