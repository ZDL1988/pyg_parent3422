package cn.itcast.core.service;

import cn.itcast.core.pojo.entity.PageResult;
import cn.itcast.core.pojo.user.User;

import java.util.List;

public interface UserService {

    /**
     * 根据手机号, 发送短信验证码
     *
     * @param phone 手机号
     */
    public void sendCode(String phone);

    /**
     * 校验用户页面填写的验证码是否正确
     *
     * @param phone   手机号
     * @param smsCode 页面的验证码
     * @return
     */
    public boolean checkCode(String phone, String smsCode);

    /**
     * 保存用户
     *
     * @param user
     */
    public void add(User user);


    void add(User user, String smscode);

    List<User> findAll();

    PageResult search(Integer page, Integer rows, User user);

    void freeze(Long[] ids);

    void unfreeze(Long[] ids);


    void update(String username);
}
