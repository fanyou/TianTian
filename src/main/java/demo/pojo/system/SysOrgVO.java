package demo.pojo.system;

import demo.pojo.BaseVO;
import lombok.Data;

/**
 * 系统机构VO
 * @author fanyou
 * @date 2019/1/18 22:43
 **/
@Data
public class SysOrgVO extends BaseVO {
    private static final long serialVersionUID = 4502442212928661331L;
    /**
     * 父级机构id
     */
    private int parentId;
    /**
     * 机构业务代码，用于标识上下级关系的字段（最多可建立10级机构，每级机构最多可建立1000个机构）
     */
    private String orgCode;
    /**
     * 机构名称
     */
    private String orgName;
    /**
     * 机构负责人id
     */
    private int manageId;
    /**
     * 机构说明
     */
    private int manageDes;
}
