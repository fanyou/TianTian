package demo.pojo.system;

import demo.pojo.BaseVO;
import lombok.Data;

/**
 * 系统角色VO
 * @author fanyou
 * @date 2019/1/18 22:43
 **/
@Data
public class SysRoleVO extends BaseVO {
    private static final long serialVersionUID = -2719521208663088393L;
    /**
     * 角色所属机构id
     */
    private int orgId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色说明
     */
    private String roleDes;
}
