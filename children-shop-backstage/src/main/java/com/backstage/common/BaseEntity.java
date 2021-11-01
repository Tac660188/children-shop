package com.backstage.common;

import com.baomidou.mybatisplus.annotation.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * @author hongdongqu
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @Id
    @Column( nullable = false , columnDefinition = "VARCHAR(80) COMMENT '逻辑id主键'")
    private String id;

    @TableField(fill = FieldFill.INSERT)
    @Column(name="create_time", nullable = false , columnDefinition = "DATETIME(6) COMMENT '创建时间'")
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @Column(name="update_time", nullable = false , columnDefinition = "DATETIME(6) COMMENT '修改时间'")
    private Date updateTime;


    @Version
    @Column(nullable = false , columnDefinition = "INT  COMMENT '版本' default 1")
    private Integer version;


    @TableLogic
    @TableField(select = false)
    @Column(nullable = false , columnDefinition = "INT  COMMENT '逻辑删除标识(0.未删除,1.已删除)' default 0")
    private Integer del;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}
