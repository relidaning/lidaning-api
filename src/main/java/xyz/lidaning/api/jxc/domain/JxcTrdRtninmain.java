package xyz.lidaning.api.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 退回入库信息对象 jxc_trd_rtninmain
 *
 * @date 2021-02-23
 */
@Data
public class JxcTrdRtninmain {
    private static final long serialVersionUID = 1L;

    /**
     * 退货单号
     */

    private String rtnno;

    /**
     * 退货时间
     */


    private Date rtntime;

    /**
     * 发票号
     */

    private String invoiceno;

    /**
     * 票据归档号
     */

    private String billfileno;

    /**
     * 客户ID
     */

    private Long clientid;

    /**
     * 客户
     */

    private String clientname;

    /**
     * 总额
     */

    private Long totalamt;

    /**
     * 业务员ID
     */

    private Long smanid;

    /**
     * 业务员
     */

    private String smanname;

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
     * 监管码上报文件生成状态
     */

    private Long isbuildmcdfile;

    /**
     * 会员ID
     */

    private Long memberid;

    /**
     * 会员名称
     */

    private String membername;

    /**
     * 总积分
     */

    private Long totalintegral;

    /**
     * 退货类型
     */

    private Long returntype;

    /**
     * 证件类型
     */

    private Long idtype;

    /**
     * 证件号码
     */

    private String idnum;

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

    private String remark;

}
