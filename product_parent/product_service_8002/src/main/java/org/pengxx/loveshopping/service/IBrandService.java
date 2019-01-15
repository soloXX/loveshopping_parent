package org.pengxx.loveshopping.service;

import org.pengxx.loveshopping.domain.Brand;
import com.baomidou.mybatisplus.service.IService;
import org.pengxx.loveshopping.query.BrandQuery;
import org.pengxx.loveshopping.util.PageList;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author soloxx
 * @since 2019-01-14
 */
public interface IBrandService extends IService<Brand> {

    /**
     * 分页查询,关联对象
     * @param query
     * @return
     */
    PageList<Brand> selectPageList(BrandQuery query);
}
