package com.sunny.ms.transport.service.impl;

import com.sunny.ms.transport.entity.node.OLTEntity;
import com.sunny.ms.transport.repository.OLTRepository;
import com.sunny.ms.transport.service.OLTService;
import org.springframework.stereotype.Service;

@Service
public class OLTServiceImpl extends ServiceImpl<OLTRepository, OLTEntity>
        implements OLTService {
}
