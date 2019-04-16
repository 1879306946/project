package com.lucius.mapper;

import com.lucius.entity.Userinfo;
import com.lucius.entity.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    
	Userinfo login(Userinfo userinfo);
	
    int countByExample(UserinfoExample example);
    
    
    int deleteByExample(UserinfoExample example);

    
    int deleteByPrimaryKey(Integer uid);

    
    int insert(Userinfo record);

    
    int insertSelective(Userinfo record);

    
    List<Userinfo> selectByExample(UserinfoExample example);

    
    Userinfo selectByPrimaryKey(Integer uid);
    
    
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    
    int updateByPrimaryKeySelective(Userinfo record);

    
    int updateByPrimaryKey(Userinfo record);
}