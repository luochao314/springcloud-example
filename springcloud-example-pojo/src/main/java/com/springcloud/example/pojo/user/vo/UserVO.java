package com.springcloud.example.pojo.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 描述类提供的功能
 *
 * @author Eugene
 * 2018-12-04 10:24
 */
@ApiModel("用户信息")
@Data
public class UserVO {

    @ApiModelProperty(value = "主键ID")
    private String id;

    @ApiModelProperty(value = "性别", dataType = "Integer")
    private Integer gendaer;

    @ApiModelProperty(value = "姓名", required = true)
    private String name;

    @ApiModelProperty(value = "昵称", required = true)
    private String nickName;

    @ApiModelProperty(value = "生日", required = true, dataType = "Date")
    private Date birthday;

    @ApiModelProperty(value = "年龄", required = true, dataType = "Integer")
    private Integer age;
}
