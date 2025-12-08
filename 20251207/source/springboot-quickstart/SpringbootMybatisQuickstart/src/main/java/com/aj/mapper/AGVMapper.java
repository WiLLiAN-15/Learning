package com.aj.mapper;

import com.aj.pojo.AGV;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AGVMapper {
    /**
     * 查询所有用户
     */
    //@Select("select id, username, password, name, age from user")
    public List<AGV> findAll();

    /**
     * 根据ID删除用户
     */
    @Delete("delete from user where id = #{id}")
    //public void deleteById(Integer id);
    public Integer deleteById(Integer id);

    /**
     * 新增用户
     */
    @Insert("insert into user(username, password, name, age) values (#{username}, #{password}, #{name}, #{age})")
    public void insert(AGV agv);

    /**
     * 更新用户
     */
    @Update("update user set username = #{username}, password = #{password}, name = #{name}, age = #{age} where id = #{id}")
    public void update(AGV agv);

    /**
     * 根据用户名和密码查询用户信息
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    //public User findByUsernameAndpassword(@Param("username") String username, @Param("password") String password);
    public AGV findBynameAndType(String eName, String type);
}




