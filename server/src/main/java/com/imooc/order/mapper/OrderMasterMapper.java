package com.imooc.order.mapper;

import com.imooc.order.entity.OrderMaster;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxlei
 * @since 2019-08-21
 */
public interface OrderMasterMapper extends JpaRepository<OrderMaster,String> {

}
