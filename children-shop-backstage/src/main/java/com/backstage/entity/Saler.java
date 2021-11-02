package com.backstage.entity;

import com.backstage.common.SyncBaseEntity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author Yeqt
 * @create 2021/11/1 14:07
 */
@Entity
@Data
@TableName("saler")
@Table(name = "saler")
@org.hibernate.annotations.Table(appliesTo = "saler",comment="商家表")
public class Saler extends SyncBaseEntity {

    @Column( columnDefinition = "VARCHAR(255) COMMENT '工程代码'")
    private String workId;

    @Column(name="work_name",  columnDefinition = "VARCHAR(255) COMMENT '工程名称'")
    private String workName;

    @Column(name="sync_time",  columnDefinition = "DATETIME(6) COMMENT '同步时间'")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date syncTime;

    @Column(name="his",  columnDefinition = "tinyint(1) COMMENT '是否为历史' default 0")
    private Boolean his;
}
