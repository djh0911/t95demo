package cn.bdqn.t95demo.controller;


import cn.bdqn.t95demo.entity.User;
import cn.bdqn.t95demo.service.IUserService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author djh
 * @since 2020-03-04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService iUserService;

    @RequestMapping("/list")
    public String list(){
        List<User> userList = iUserService.list();
        return JSONArray.toJSONString(userList);
    }
}
