package xyz.lidaning.api.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 商户信息对象 jxc_s_corpinfo
 *
 * @date 2021-02-23
 */
@Data
public class JxcSCorpinfo {
    private static final long serialVersionUID = 1L;

    /**
     * #!|ID
     */
    private String id;

    /**
     * 企业名称
     */

    private String corpname;

    /**
     * 企业编码
     */

    private String corpcode;

    /**
     * 组织机构代码
     */

    private String orgdeptno;

    /**
     * 企业密码
     */

    private String corppassword;

    /**
     * $column.columnComment
     */

    private String areacode;

    /**
     * 地区名称
     */

    private String areaname;

    /**
     * 地址
     */

    private String corpadress;

    /**
     * 许可证号
     */

    private String license;

    /**
     * 联系人
     */

    private String linkname;

    /**
     * 联系电话
     */

    private String linktel;

    /**
     * 手机号码
     */

    private String mobile;

    /**
     * QQ
     */

    private String qq;

    /**
     * MSN
     */

    private String msn;

    /**
     * E-mail
     */

    private String email;

    /**
     * 经营范围
     */

    private String products;

    /**
     * 企业类型编码
     */

    private String corptypecode;

    /**
     * 企业类型名称
     */

    private String corptypename;

    /**
     * 是否是定点药店
     */

    private Long isfixedcorp;

    /**
     * 硬盘编号
     */

    private String hddseri;

    /**
     * 自动更新地址
     */

    private String updateaddress;

    /**
     * 流通地址
     */

    private String ltaddress;

    /**
     * 企业状态
     */

    private Long status;

    /**
     * 本机mac地址
     */

    private String macaddress;

    /**
     * 管理端最后一次登录时间
     */


    private Date finallystarttime;

    /**
     * 最大终端授权数
     */

    private Long zdcount;

    /**
     * 电子监管网企业入网编号
     */

    private String refseqno;

    /**
     * 社会信用代码
     */

    private String socialcreditcode;

    /**
     * 手机终端数
     */

    private String mobilecount;

    /**
     * 当前服务器时间
     */

    private String currenttime;

    /**
     * 手机服务结束时间
     */

    private String mobileendtime;

    private String refentid;
    private String entid;
    private String appkey;

    private String medicalinstitutionid;
    private String sdybupdflag;

}
