package com.sunny.ms.transport.service.impl;

import cn.hutool.core.bean.copier.CopyOptions;
import com.sunny.chaincloud.common.util.BeanUtil;
import com.sunny.chaincloud.common.util.ObjectUtil;
import com.sunny.ms.transport.entity.node.BaseEntity;
import com.sunny.ms.transport.repository.BaseRepository;
import com.sunny.ms.transport.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基础服务的实现
 */
public class ServiceImpl<M extends BaseRepository<T, Long>, T extends BaseEntity> implements IService<T> {

    @Autowired
    private M repository;

    @Override
    public T queryByBid(Long bid) {
        return this.repository.findByBid(bid).orElse(null);
    }

    @Override
    public T create(T t) {
        t.setId(null);
        return this.repository.save(t);
    }

    @Override
    public T update(T t) {
        T entity = this.queryByBid(t.getBid());
        if (ObjectUtil.isEmpty(entity)) {
            return null;
        }
        BeanUtil.copyProperties(t, entity, CopyOptions.create().ignoreNullValue().setIgnoreProperties("id", "bid"));
        return this.repository.save(entity);
    }

    @Override
    public Boolean deleteByBid(Long bid) {
        return this.repository.deleteByBid(bid) > 0;
    }
}
