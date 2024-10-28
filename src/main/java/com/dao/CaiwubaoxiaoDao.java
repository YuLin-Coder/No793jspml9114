package com.dao;

import com.entity.CaiwubaoxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwubaoxiaoVO;
import com.entity.view.CaiwubaoxiaoView;


/**
 * 财务报销
 * 
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface CaiwubaoxiaoDao extends BaseMapper<CaiwubaoxiaoEntity> {
	
	List<CaiwubaoxiaoVO> selectListVO(@Param("ew") Wrapper<CaiwubaoxiaoEntity> wrapper);
	
	CaiwubaoxiaoVO selectVO(@Param("ew") Wrapper<CaiwubaoxiaoEntity> wrapper);
	
	List<CaiwubaoxiaoView> selectListView(@Param("ew") Wrapper<CaiwubaoxiaoEntity> wrapper);

	List<CaiwubaoxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwubaoxiaoEntity> wrapper);
	
	CaiwubaoxiaoView selectView(@Param("ew") Wrapper<CaiwubaoxiaoEntity> wrapper);
	
}
