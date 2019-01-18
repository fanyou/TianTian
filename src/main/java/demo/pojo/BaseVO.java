package demo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fanyou
 * @date 2019/1/18 22:43
 **/
@Data
public abstract class BaseVO implements Serializable {
    private static final long serialVersionUID = 7739365697134372415L;
    /**
     * 主键，唯一标识
     */
    private int id;
    /**
     * 创建人id
     */
    private int createId;
    /**
     * 更新人id
     */
    private int updateId;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 删除标识，1已删除，0未删除，默认0
     */
    private int delFlag;
    /**
     * 表单查询起始时间
     */
    private String queryTimeStart;
    /**
     * 表单查询结束时间
     */
    private String queryTimeEnd;
}
