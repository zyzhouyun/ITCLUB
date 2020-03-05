package com.dream.itclub.dao;

import com.dream.itclub.pojo.RepCom;
import com.dream.itclub.pojo.RepComExample;
import com.dream.itclub.pojo.custom.CustomRepCom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepComMapper {
    long countByExample(RepComExample example);

    int deleteByExample(RepComExample example);

    int deleteByPrimaryKey(String recomid);

    int insert(RepCom record);

    int insertSelective(RepCom record);

    List<RepCom> selectByExample(RepComExample example);

    RepCom selectByPrimaryKey(String recomid);

    int updateByExampleSelective(@Param("record") RepCom record, @Param("example") RepComExample example);

    int updateByExample(@Param("record") RepCom record, @Param("example") RepComExample example);

    int updateByPrimaryKeySelective(RepCom record);

    int updateByPrimaryKey(RepCom record);

    //自行编写的语句
    List<CustomRepCom> findCustomRepCom(String id);

    CustomRepCom findCustomRepComById(String id);
}