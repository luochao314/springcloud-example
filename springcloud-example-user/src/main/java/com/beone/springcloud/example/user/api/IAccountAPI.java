package com.beone.springcloud.example.user.api;

import com.springcloud.example.pojo.center.vo.AccountVO;
import com.springcloud.example.pojo.swagger2.DataResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "example-center")
public interface IAccountAPI {


    @PostMapping(value = "/accounts/{userId}")
    DataResponseResult<AccountVO> get(@PathVariable("userId") String userId);
}
