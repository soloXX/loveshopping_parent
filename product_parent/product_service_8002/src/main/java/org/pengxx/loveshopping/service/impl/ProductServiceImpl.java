package org.pengxx.loveshopping.service.impl;

import org.pengxx.loveshopping.domain.Product;
import org.pengxx.loveshopping.mapper.ProductMapper;
import org.pengxx.loveshopping.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author soloxx
 * @since 2019-01-14
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
