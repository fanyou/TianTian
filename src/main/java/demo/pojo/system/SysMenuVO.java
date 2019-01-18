package demo.pojo.system;

import demo.pojo.BaseVO;
import lombok.Data;

/**
 * 系统菜单VO
 * @author fanyou
 * @date 2019/1/18 22:43
 **/
@Data
public class SysMenuVO extends BaseVO {
    private static final long serialVersionUID = -672003288143558454L;
    /**
     * 父级菜单id
     */
    private int parentId;
    /**
     * 菜单业务代码，用于标识上下级关系的字段（最多可建立10级菜单，每级菜单最多可建立1000个菜单）
     */
    private String menuCode;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 角色所属机构id
     */
    private int isLeaf;
    /**
     * 菜单跳转链接
     */
    private String menuUrl;
    /**
     * 菜单图标
     */
    private String menuIco;
    /**
     * 菜单排序
     */
    private int menuSort;
}
