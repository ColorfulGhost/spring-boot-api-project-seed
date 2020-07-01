package com.company.project.manage.dto.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Ray。
 * @version 1.0
 * @date 2020/6/29 13:50
 */
@Data
public class LoginParam {
    @NotNull(message = "用户名不能为空!")
    private String username;
    @NotNull(message = "密码不能为空!")
    private String password;
    private boolean rememberMe;
}
