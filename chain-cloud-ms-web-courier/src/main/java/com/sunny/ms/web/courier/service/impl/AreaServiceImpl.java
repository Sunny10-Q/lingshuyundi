package com.sunny.ms.web.courier.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.sunny.chaincloud.api.base.common.AreaFeign;
import com.sunny.chaincloud.common.util.BeanUtil;
import com.sunny.ms.web.courier.service.AreaService;
import com.sunny.ms.web.courier.vo.area.AreaSimpleVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaFeign areaFeign;

    @Override
    public List<AreaSimpleVO> findChildrenAreaByParentId(Long parentId) {

        var areas = areaFeign.findChildren(parentId);
        if (CollUtil.isEmpty(areas)) {
            return Collections.emptyList();
        }
        var areaSimpleVOS = new ArrayList<AreaSimpleVO>();
        areas.forEach(area -> {
            AreaSimpleVO areaSimpleVO = BeanUtil.toBean(area, AreaSimpleVO.class);
            areaSimpleVOS.add(areaSimpleVO);
        });
        return areaSimpleVOS;
    }
}
