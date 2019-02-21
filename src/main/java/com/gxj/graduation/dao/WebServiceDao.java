package com.gxj.graduation.dao;

import com.gxj.graduation.dto.WSFunctionDto;
import com.gxj.graduation.dto.WebServiceDto;
import com.gxj.graduation.entity.WSParams;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebServiceDao {
    List<WebServiceDto> queryAllIdAndName();
    List<WSFunctionDto> queryWSFunctionByWSid(int WSid);
    List<WSParams> queryParamsByFid(@Param("Fid")int Fid, @Param("mode")String mode);

}
