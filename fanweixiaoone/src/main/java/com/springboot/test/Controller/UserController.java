package com.springboot.test.Controller;
import com.springboot.test.entity.User;
import com.springboot.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuzehai on 2017/12/19.
 */
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserById")
    public User getUserById(String id) {
        User user =  userService.findUserById(id);
        return user;
    }

    /**
     * 用户信息注册
     * @param user
     */
    @PostMapping("/addUser")
    public void insertUser(User user){
        validParamsForAddUser(user);
        userService.insertUser(user);
    }


    private void validParamsForAddUser(User user){
        if(StringUtils.isEmpty(user.getCard_no())){
            throw new RuntimeException("身份证信息不能为空");
        }
        if(StringUtils.isEmpty(user.getMoible_no())){
            throw new RuntimeException("手机号不能为空");
        }
        if(StringUtils.isEmpty(user.getZhifubao_phone())){
            throw new RuntimeException("支付宝对应的手机号不能为空");
        }if(StringUtils.isEmpty(user.getZhifubao_name())){
            throw new RuntimeException("支付宝昵称不能为空");
        }if(StringUtils.isEmpty(user.getWeixin_phone())){
            throw new RuntimeException("微信对应的手机号不能为空");
        }if(StringUtils.isEmpty(user.getWeixin_name())){
            throw new RuntimeException("微信昵称不能为空");
        }if(StringUtils.isEmpty(user.getUser_name())){
            throw new RuntimeException("姓名不能为空");
        }
    }
}
