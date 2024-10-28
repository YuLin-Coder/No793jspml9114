package com.dao;

import com.entity.WuzicaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzicaigouVO;
import com.entity.view.WuzicaigouView;


/**
 * 物资采购
 * 
 * @author 
 * @email 
 * @date 2021-04-16 18:03:15
 */
public interface WuzicaigouDao extends BaseMapper<WuzicaigouEntity> {
	
	List<WuzicaigouVO> selectListVO(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
	
	WuzicaigouVO selectVO(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
	
	List<WuzicaigouView> selectListView(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);

	List<WuzicaigouView> selectListView(Pagination page,@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
	
	WuzicaigouView selectView(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
	
}
