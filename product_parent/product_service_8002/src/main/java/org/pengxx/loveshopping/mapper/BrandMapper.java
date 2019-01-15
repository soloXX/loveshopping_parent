package org.pengxx.loveshopping.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import org.pengxx.loveshopping.domain.Brand;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.pengxx.loveshopping.query.BrandQuery;

import java.util.List;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author soloxx
 * @since 2019-01-14
 */
public interface BrandMapper extends BaseMapper<Brand> {
    /**
     * 查询分页数据
     * @param page
     * @param query
     * @return
     */
    List<Brand> selectPageList(Page<Brand> page, BrandQuery query);
}
