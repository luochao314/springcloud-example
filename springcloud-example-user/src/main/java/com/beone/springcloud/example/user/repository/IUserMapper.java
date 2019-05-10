package com.beone.springcloud.example.user.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beone.springcloud.example.user.pojo.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper extends BaseMapper<UserDO> {
}
