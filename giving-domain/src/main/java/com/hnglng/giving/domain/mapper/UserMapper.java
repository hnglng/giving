package com.hnglng.giving.domain.mapper;

import com.hnglng.giving.domain.model.User;
import com.hnglng.giving.domain.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

	@Select("select *from t_user where account=#{account}")
	UserInfo findByAccount(String account);


	@Results({
			@Result(property = "name", column = "name"),
			@Result(property = "age", column = "age")
	})
	@Select("SELECT name, age FROM user")
	List<User> findAll();

	@Select("SELECT * FROM user WHERE name = #{name}")
	User findByName(@Param("name") String name);

	@Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
	int insert(@Param("name") String name, @Param("age") Integer age);

	@Update("UPDATE user SET age=#{age} WHERE name=#{name}")
	void update(User user);

	@Delete("DELETE FROM user WHERE id =#{id}")
	void delete(Long id);

	@Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
	int insertByUser(User user);

	@Insert("INSERT INTO user(name, age) VALUES(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
	int insertByMap(Map<String, Object> map);

}
