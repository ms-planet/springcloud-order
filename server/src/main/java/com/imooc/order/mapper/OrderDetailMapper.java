package com.imooc.order.mapper;

import com.imooc.order.entity.OrderDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zxlei
 * @since 2019-08-21
 */
public interface OrderDetailMapper extends JpaRepository<OrderDetail, String> {


    List<OrderDetail> findByOrderId(String orderId);

}
