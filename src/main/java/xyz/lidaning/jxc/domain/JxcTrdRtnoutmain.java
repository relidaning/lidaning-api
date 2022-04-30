package xyz.lidaning.jxc.domain;


import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 退回出库信息对象 jxc_trd_rtnoutmain
 *
 * @date 2021-02-23
 */
@Data
public class JxcTrdRtnoutmain {
    private static final long serialVersionUID = 1L;

    /**
     * 退货单号
     */

    private String rtnno;

    /**
     * 退货日期
     */


    private Date rtntime;

    /**
     * 原进货单号
     */

    private String obuyno;

    /**
     * 发票号
     */

    private String invoiceno;

    /**
     * $column.columnComment
     */

    private String supplierid;

    /**
     * 供商名称
     */

    private String suppliername;

    /**
     * 应付款总额
     */

    private Long dueamt;

    /**
     * 待付款总额
     */

    private Long waitpayamt;

    /**
     * 已付款总额
     */

    private Long payment;

    /**
     * 复核人ID
     */

    private Long repsnid;

    /**
     * 复核人
     */

    private String repsnname;

    /**
     * 经手人ID
     */

    private Long operid;

    /**
     * 经手人
     */

    private String opername;

    /**
     * 检验员ID
     */

    private Long inspectorid;

    /**
     * 检验员
     */

    private String inspectorname;

    /**
     * 审核状态
     */

    private Long chkstate;

    /**
     * 单据类别
     */

    private Long billtype;

    /**
     * 录入人ID
     */

    private Long makerid;

    /**
     * 录入人
     */

    private String makername;

    /**
     * 录入时间
     */


    private Date maketime;

    /**
     * 审核人ID
     */

    private Long auditorid;

    /**
     * 审核人
     */

    private String auditorname;

    /**
     * 首次审核时间
     */


    private Date firstchktime;

    /**
     * 调整提交时间
     */


    private Date adjsubmittime;

    /**
     * #!|上传文件
     */

    private String rptfilename;

    /**
     * #!|上报前状态
     */

    private Long rptbeforestatus;

    /**
     * #!|上传状态
     */

    private Long rptstatus;

    /**
     * 票据归档号
     */

    private String billfileno;

    /**
     * 监管码上报文件生成状态
     */

    private Long isbuildmcdfile;

    /**
     * 退回类型
     */

    private Long returntype;

    /**
     * 是否使用监管码
     */

    private Long ismoncode;

    /**
     * $column.columnComment
     */
    private String id;

    /**
     * 同步时间
     */


    private Date synctime;

    /**
     * 提交状态（0未提交，1提交失败，2部分失败，3全部成功）
     */

    private String substatus;

    /**
     * 失败原因
     */

    private String failreason;

    private String whereCouse;

    private String corpid;

    private List rtnoutlist;

    private String remark;

}
