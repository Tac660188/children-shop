package com.backstage.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author hongdongqu
 */
@MappedSuperclass
public class SyncBaseEntity extends BaseEntity {
    private static final long serialVersionUID = 1L;


    @Column( columnDefinition = "VARCHAR(255) COMMENT '工程代码'")
    private String workId;

    @Column(name="work_name",  columnDefinition = "VARCHAR(255) COMMENT '工程名称'")
    private String workName;

    @Column(name="sync_time",  columnDefinition = "DATETIME(6) COMMENT '同步时间'")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date syncTime;

    @Column(name="his",  columnDefinition = "tinyint(1) COMMENT '是否为历史' default 0")
    private Boolean his;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public Boolean getHis() {
        return his;
    }

    public void setHis(Boolean his) {
        this.his = his;
    }
}
