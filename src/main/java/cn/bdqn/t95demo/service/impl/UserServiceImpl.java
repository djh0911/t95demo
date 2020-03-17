package cn.bdqn.t95demo.service.impl;

import cn.bdqn.t95demo.entity.User;
import cn.bdqn.t95demo.mapper.UserMapper;
import cn.bdqn.t95demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author djh
 * @since 2020-03-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
