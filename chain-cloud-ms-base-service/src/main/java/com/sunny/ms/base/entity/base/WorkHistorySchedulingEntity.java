package com.sunny.ms.base.entity.base;

import com.baomidou.mybatisplus.annotation.TableName;
import com.sunny.chaincloud.common.entity.BaseEntity;
import lombok.Data;

@Data
@TableName("cc_work_history_scheduling")
public class WorkHistorySchedulingEntity extends BaseEntity {
    private Long userId;

    private String name;

    private String phone;

    private String employeeNumber;

    private Integer workDay;

    private String workMonth;

    private Byte userType;

    private Byte workPatternType;

    private Long workPatternId;
}