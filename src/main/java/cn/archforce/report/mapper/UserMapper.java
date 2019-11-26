package cn.archforce.report.mapper;

import cn.archforce.report.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: tanbaolin
 * @Date: Created in 5:11 下午 2019/11/25
 * @Description:
 * @Modified By:
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user (id,name,account_id,token,gmt_create,gmt_modified) values (#{id},#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    User findById(@Param("id") Integer id);
}
