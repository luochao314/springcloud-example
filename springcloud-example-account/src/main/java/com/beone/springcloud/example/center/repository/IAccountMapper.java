package com.beone.springcloud.example.center.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beone.springcloud.example.center.pojo.domain.AccountDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAccountMapper extends BaseMapper<AccountDO> {
}
