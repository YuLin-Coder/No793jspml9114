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


import com.dao.CaiwurenyuanDao;
import com.entity.CaiwurenyuanEntity;
import com.service.CaiwurenyuanService;
import com.entity.vo.CaiwurenyuanVO;
import com.entity.view.CaiwurenyuanView;

@Service("caiwurenyuanService")
public class CaiwurenyuanServiceImpl extends ServiceImpl<CaiwurenyuanDao, CaiwurenyuanEntity> implements CaiwurenyuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwurenyuanEntity> page = this.selectPage(
                new Query<CaiwurenyuanEntity>(params).getPage(),
                new EntityWrapper<CaiwurenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwurenyuanEntity> wrapper) {
		  Page<CaiwurenyuanView> page =new Query<CaiwurenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwurenyuanVO> selectListVO(Wrapper<CaiwurenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwurenyuanVO selectVO(Wrapper<CaiwurenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwurenyuanView> selectListView(Wrapper<CaiwurenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwurenyuanView selectView(Wrapper<CaiwurenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
