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


import com.dao.HouqinrenyuanDao;
import com.entity.HouqinrenyuanEntity;
import com.service.HouqinrenyuanService;
import com.entity.vo.HouqinrenyuanVO;
import com.entity.view.HouqinrenyuanView;

@Service("houqinrenyuanService")
public class HouqinrenyuanServiceImpl extends ServiceImpl<HouqinrenyuanDao, HouqinrenyuanEntity> implements HouqinrenyuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HouqinrenyuanEntity> page = this.selectPage(
                new Query<HouqinrenyuanEntity>(params).getPage(),
                new EntityWrapper<HouqinrenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HouqinrenyuanEntity> wrapper) {
		  Page<HouqinrenyuanView> page =new Query<HouqinrenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HouqinrenyuanVO> selectListVO(Wrapper<HouqinrenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HouqinrenyuanVO selectVO(Wrapper<HouqinrenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HouqinrenyuanView> selectListView(Wrapper<HouqinrenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HouqinrenyuanView selectView(Wrapper<HouqinrenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
