package com.star.mybatisplus.mp.controller;


import com.star.mybatisplus.mp.domain.User;
import com.star.mybatisplus.mp.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whr
 * @since 2021-02-24
 */
@RestController
@RequestMapping("/mp/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/selectAll")
    public void selectAll(){
        List<User> userList = userService.list();
        if (userList.size()>0) {
            for (User user : userList) {
                System.out.println(user.toString());
            }
        }
    }

    @PostMapping("/deleteById")
    public String deleteById(@RequestParam Integer id){
        boolean result = userService.removeById(id);
        if (result) return "删除成功";
        return "删除失败";
    }

    @PostMapping("/insert")
    public String insert(@RequestBody User user){
        boolean result = userService.save(user);
        if (result) return "新增成功";
        return "新增失败";
    }

    @PostMapping("/updateById")
    public String updateById(@RequestBody User user){
        boolean result = userService.updateById(user);
        if (result) return "更改成功";
        return "更改失败";
    }

}
