package xyz.lidaning.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 购进信息对象 jxc_trd_buymain
 *
 * @date 2021-02-23
 */
@Data
public class JxcTrdBuymain{
    private static final long serialVersionUID = 1L;

    /**
     * 入库单号
     */

    private String instkno;

    /**
     * 到货日期
     */


    private Date goodarrtime;

    /**
     * 订货单号
     */

    private String ordno;

    /**
     * 发票号
     */

    private String invoiceno;

    /**
     * 票据归档号
     */

    private String billfileno;

    /**
     * $column.columnComment
     */

    private String supplierid;

    /**
     * 供应商
     */

    private String suppliername;

    /**
     * 总额
     */

    private Long totalamt;

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
     * 检验
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
     * 监管码上报文件生成状态
     */

    private Long isbuildmcdfile;

    /**
     * 上游单据号
     */

    private String upstreamno;

    /**
     * 是否使用监管码
     */

    private Long ismoncode;

    /**
     * 预售总额
     */

    private Long preselltotalamt;

    /**
     * 预盈利
     */

    private Long preprofit;

    /**
     * 开票时间
     */


    private Date kptime;

    /**
     * 随货单号
     */

    private String goodsno;

    /**
     * 起运时间
     */


    private Date trsstatime;

    /**
     * 起运温度
     */

    private String trsstatemp;

    /**
     * 运输途中最高温度
     */

    private String trsprohigh;

    /**
     * 运输途中最低温度
     */

    private String trsprolow;

    /**
     * 到货温度
     */

    private String arrtemp;

    /**
     * 运输工具
     */

    private String trstool;

    /**
     * 工具编号
     */

    private String toolno;

    /**
     * 是否已生成拒收报告
     */

    private Long iscreatedrej;

    /**
     * 起运地址
     */

    private String shippingaddress;

    /**
     * 到货地址
     */

    private String deliveryaddress;

    /**
     * 收货人id
     */

    private Long consigneeid;

    /**
     * 收货人名称
     */

    private String consigneename;

    /**
     * id
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

    public String whereCouse;

    public String corpid;

    public String remark;

}
