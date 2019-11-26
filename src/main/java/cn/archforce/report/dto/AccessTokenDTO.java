package cn.archforce.report.dto;

import lombok.Data;

/**
 * @Author: tanbaolin
 * @Date: Created in 2:51 下午 2019/11/25
 * @Description:
 * @Modified By:
 */
@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
