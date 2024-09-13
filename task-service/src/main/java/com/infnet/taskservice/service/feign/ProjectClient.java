package com.infnet.taskservice.service.feign;

import com.infnet.taskservice.model.Project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("USER-SERVICE")
public interface ProjectClient {
    @GetMapping("/project/{id}")
    Project findById(@PathVariable("id") Long id);
}
