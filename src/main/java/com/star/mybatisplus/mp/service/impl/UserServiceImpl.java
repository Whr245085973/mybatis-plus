package com.star.mybatisplus.mp.service.impl;

import com.star.mybatisplus.mp.domain.User;
import com.star.mybatisplus.mp.mapper.UserMapper;
import com.star.mybatisplus.mp.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whr
 * @since 2021-02-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
