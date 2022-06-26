package com.orange.mysql_advance.controller;

import com.orange.common.AjaxResult;
import com.orange.mysql_advance.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Package : com.orange.mysql_advance.controller
 * @Author : yilantingfeng
 * @Date : 2022/4/19 4:51 PM
 * @Version : V1.0
 */
@RestController
public class JobsController {
    @Autowired
    private JobsService jobsService;

    @GetMapping("/jobs")
    public AjaxResult getJobs(@RequestParam(value = "jobId", required = false) String jobId) {
        return AjaxResult.success(jobsService.selectAllByJobId(jobId));
    }

    @GetMapping("/deljob")
    public AjaxResult getJobs2() {
        return AjaxResult.success(jobsService.deleteByJobId("1231"));
    }
}
