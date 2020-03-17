package cn.bdqn.t95demo.service.impl;

import cn.bdqn.t95demo.entity.Address;
import cn.bdqn.t95demo.mapper.AddressMapper;
import cn.bdqn.t95demo.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
