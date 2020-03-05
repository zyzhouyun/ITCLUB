package com.dream.itclub.dao;

import com.dream.itclub.pojo.Fans;
import com.dream.itclub.pojo.FansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FansMapper {
    long countByExample(FansExample example);

    int deleteByExample(FansExample example);

    int deleteByPrimaryKey(String fansid);

    int insert(Fans record);

    int insertSelective(Fans record);

    List<Fans> selectByExample(FansExample example);

    Fans selectByPrimaryKey(String fansid);

    int updateByExampleSelective(@Param("record") Fans record, @Param("example") FansExample example);

    int updateByExample(@Param("record") Fans record, @Param("example") FansExample example);

    int updateByPrimaryKeySelective(Fans record);

    int updateByPrimaryKey(Fans record);
}