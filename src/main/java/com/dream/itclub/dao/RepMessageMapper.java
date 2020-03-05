package com.dream.itclub.dao;

import com.dream.itclub.pojo.RepMessage;
import com.dream.itclub.pojo.RepMessageExample;
import com.dream.itclub.pojo.custom.CustomRepMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepMessageMapper {
    long countByExample(RepMessageExample example);

    int deleteByExample(RepMessageExample example);

    int deleteByPrimaryKey(String remsgid);

    int insert(RepMessage record);

    int insertSelective(RepMessage record);

    List<RepMessage> selectByExample(RepMessageExample example);

    RepMessage selectByPrimaryKey(String remsgid);

    int updateByExampleSelective(@Param("record") RepMessage record, @Param("example") RepMessageExample example);

    int updateByExample(@Param("record") RepMessage record, @Param("example") RepMessageExample example);

    int updateByPrimaryKeySelective(RepMessage record);

    int updateByPrimaryKey(RepMessage record);

//    自行编写的
    List<CustomRepMessage> findRepMessage(String id);

    CustomRepMessage findRepMessageByRemsgId(String id);
}