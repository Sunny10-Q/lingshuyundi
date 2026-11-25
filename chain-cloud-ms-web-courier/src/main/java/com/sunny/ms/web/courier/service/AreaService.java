package com.sunny.ms.web.courier.service;

import com.sunny.ms.web.courier.vo.area.AreaSimpleVO;

import java.util.List;

public interface AreaService {
    List<AreaSimpleVO> findChildrenAreaByParentId(Long parentId);
}
