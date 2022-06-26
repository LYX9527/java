package com.orange.mysql_advance.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.orange.mysql_advance.bean.Jobs;
import com.orange.mysql_advance.service.JobsService;
import com.orange.mysql_advance.mapper.JobsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author yilantingfeng
* @description 针对表【jobs】的数据库操作Service实现
* @createDate 2022-04-19 16:47:51
*/
@Service
public class JobsServiceImpl extends ServiceImpl<JobsMapper, Jobs>
    implements JobsService{
    @Autowired
    private JobsMapper jobsMapper;
    @Override
    public List<Jobs> selectAllByJobId(String jobId) {
        return jobsMapper.selectAllByJobId(jobId);
    }

    public Integer deleteByJobId(String jobId){
       return jobsMapper.delByJobId(jobId);
    }
}




