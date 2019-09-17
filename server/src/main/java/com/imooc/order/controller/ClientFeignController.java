package com.imooc.order.controller;


import com.imooc.order.utils.ResultVOUtil;
import com.imooc.order.vo.ResultVO;
import com.imooc.product.client.ProductClient;
import com.imooc.product.client.common.DecreaseStockInput;
import com.imooc.product.client.common.ProductInfoOutPut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author zxlei
 * @date 2019/8/23 11:15
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
@RestController
@Slf4j
public class ClientFeignController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/feign/getProduct")
    public String getProduct() {
        String response = productClient.productMsg();
        log.info("response = {}", response);
        return response;
    }

    @GetMapping("/getProductList")
    public ResultVO<List<ProductInfoOutPut>> getProductList() {
        List<ProductInfoOutPut> productInfoList = productClient.ListForOrder(Arrays.asList("164103465734242707"));
        log.info("response = {}", productInfoList);
        ResultVO resultVO = ResultVOUtil.success(productInfoList);
        return resultVO;
    }

    @GetMapping("/productDec")
    public String productDec() {
        productClient.decreaseStock(Arrays.asList(new DecreaseStockInput("164103465734242707", 3)));
        return "success";
    }
}
