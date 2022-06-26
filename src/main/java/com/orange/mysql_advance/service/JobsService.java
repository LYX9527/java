package com.orange.mysql_advance.service;

import com.orange.mysql_advance.bean.Jobs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author yilantingfeng
* @description 针对表【jobs】的数据库操作Service
* @createDate 2022-04-19 16:47:51
*/
public interface JobsService extends IService<Jobs> {

    List<Jobs> selectAllByJobId(String jobId);

    Integer deleteByJobId(String jobId);
}
