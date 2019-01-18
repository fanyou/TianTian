package demo.pojo.system;

import demo.pojo.BaseVO;
import lombok.Data;

/**
 * 系统用户VO
 * @author fanyou
 * @date 2019/1/18 22:43
 **/
@Data
public class SysUserVO extends BaseVO {
    private static final long serialVersionUID = 8166403101946131210L;
    /**
     * 用户所属机构id
     */
    private int orgId;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 英文名
     */
    private String englishName;
    /**
     * 用户头像路径
     */
    private String headImgPath;
    /**
     * 登录名
     */
    private String loginName;
    /**
     * 登录密码
     */
    private String loginPwd;
    /**
     * 身份证号
     */
    private String idCardNum;
    /**
     * 性别
     */
    private int sex;
    /**
     * 出生年月
     */
    private String birthTime;
    /**
     * Baptism年月
     */
    private String baptismTime;
    /**
     * 来自国家，编码
     */
    private int nationFrom;
    /**
     * 来自省份，编码
     */
    private int provinceFrom;
    /**
     * 来自市，编码
     */
    private int cityFrom;
    /**
     * 现居国家，编码
     */
    private int nationNow;
    /**
     * 现居省份，编码
     */
    private int provinceNow;
    /**
     * 现居市，编码
     */
    private int cityNow;
    /**
     * 个人电话，多个电话之间以英文逗号相隔
     */
    private String tel;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 毕业院校
     */
    private String graduateSchool;
    /**
     * 个人签名
     */
    private String signature;
    /**
     * 登录时间
     */
    private String loginTime;
    /**
     * 上次登录时间
     */
    private String lastLoginTime;
    /**
     * 登录次数
     */
    private int loginCount;
}
