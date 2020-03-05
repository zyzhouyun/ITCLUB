package com.dream.itclub.dao;

import com.dream.itclub.pojo.FocusOn;
import com.dream.itclub.pojo.FocusOnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FocusOnMapper {
    long countByExample(FocusOnExample example);

    int deleteByExample(FocusOnExample example);

    int deleteByPrimaryKey(String likeid);

    int insert(FocusOn record);

    int insertSelective(FocusOn record);

    List<FocusOn> selectByExample(FocusOnExample example);

    FocusOn selectByPrimaryKey(String likeid);

    int updateByExampleSelective(@Param("record") FocusOn record, @Param("example") FocusOnExample example);

    int updateByExample(@Param("record") FocusOn record, @Param("example") FocusOnExample example);

    int updateByPrimaryKeySelective(FocusOn record);

    int updateByPrimaryKey(FocusOn record);
}