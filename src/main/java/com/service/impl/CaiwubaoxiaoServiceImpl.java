package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaiwubaoxiaoDao;
import com.entity.CaiwubaoxiaoEntity;
import com.service.CaiwubaoxiaoService;
import com.entity.vo.CaiwubaoxiaoVO;
import com.entity.view.CaiwubaoxiaoView;

@Service("caiwubaoxiaoService")
public class CaiwubaoxiaoServiceImpl extends ServiceImpl<CaiwubaoxiaoDao, CaiwubaoxiaoEntity> implements CaiwubaoxiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwubaoxiaoEntity> page = this.selectPage(
                new Query<CaiwubaoxiaoEntity>(params).getPage(),
                new EntityWrapper<CaiwubaoxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwubaoxiaoEntity> wrapper) {
		  Page<CaiwubaoxiaoView> page =new Query<CaiwubaoxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwubaoxiaoVO> selectListVO(Wrapper<CaiwubaoxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwubaoxiaoVO selectVO(Wrapper<CaiwubaoxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwubaoxiaoView> selectListView(Wrapper<CaiwubaoxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwubaoxiaoView selectView(Wrapper<CaiwubaoxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
