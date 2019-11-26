package cn.archforce.report.dto;

import lombok.Data;

/**
 * @Author: tanbaolin
 * @Date: Created in 3:11 下午 2019/11/25
 * @Description:
 * @Modified By:
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;

}
