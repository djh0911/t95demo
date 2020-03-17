package cn.bdqn.t95demo.service.impl;

import cn.bdqn.t95demo.entity.Bill;
import cn.bdqn.t95demo.mapper.BillMapper;
import cn.bdqn.t95demo.service.IBillService;
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
public class BillServiceImpl extends ServiceImpl<BillMapper, Bill> implements IBillService {

}
