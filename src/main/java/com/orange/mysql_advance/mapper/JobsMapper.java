package com.orange.mysql_advance.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.orange.mysql_advance.bean.Jobs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author yilantingfeng
* @description 针对表【jobs】的数据库操作Mapper
* @createDate 2022-04-19 16:47:51
* @Entity com.orange.mysql_advance.bean.Jobs
*/
@Mapper
public interface JobsMapper extends BaseMapper<Jobs> {
    List<Jobs> selectAllByJobId(@Param("jobId") String jobId);

    int delByJobId(@Param("jobId") String jobId);

}




