package com.sunny.ms.web.courier.service;


import com.sunny.ms.web.courier.vo.login.AccountLoginVO;
import com.sunny.ms.web.courier.vo.login.LoginVO;
import com.sunny.chaincloud.common.vo.R;

public interface LoginService {

    /**
     * 根据用户名和密码进行登录
     *
     * @param accountLoginVO 登录信息
     * @return token
     */
    R<LoginVO> accountLogin(AccountLoginVO accountLoginVO);
}
