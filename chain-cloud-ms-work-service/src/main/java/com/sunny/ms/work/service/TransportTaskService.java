package com.sunny.ms.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunny.chaincloud.common.util.PageResponse;
import com.sunny.chaincloud.domain.work.domain.*;
import com.sunny.chaincloud.domain.work.domain.request.*;
import com.sunny.chaincloud.domain.work.domain.response.TransportTaskMonthlyDistanceDTO;
import com.sunny.chaincloud.domain.work.domain.response.TransportTaskStatusCountDTO;
import com.sunny.chaincloud.domain.work.enums.TransportTaskStatusEnum;
import com.sunny.ms.work.entity.TransportTaskEntity;

import java.util.List;

public interface TransportTaskService extends IService<TransportTaskEntity> {

    Boolean updateStatus(Long id, TransportTaskStatusEnum status);

    PageResponse<TransportTaskDTO> findByPage(TransportTaskPageQueryDTO pageQueryDTO);

    List<TransportTaskEntity> findAll(List<Long> ids, Long id, Integer status, TransportTaskDTO dto);

    void completeTransportTask(TransportTaskCompleteDTO transportTaskCompleteDTO);

    void startTransportTask(TransportTaskStartDTO transportTaskStartDTO);

    List<String> queryTransportOrderIdListById(Long id);

    List<TransportTaskDTO> findAllByOrderIdOrTaskId(String transportOrderId, Long transportTaskId);

    TransportTaskDTO findById(Long id);

    List<TransportTaskStatusCountDTO> groupByStatus();

    void adjust(TaskTransportUpdateDTO dto);

    void delayedDelivery(TransportTaskDelayDeliveryDTO transportTaskDelayDeliveryDTO);

    List<TransportTaskMonthlyDistanceDTO> monthlyDistanceStatistics(List<String> transportTaskIds, String month);

    List<Long> findByAgencyId(Long startAgencyId, Long endAgencyId);

    Long countByTruckId(Long truckId);
}
