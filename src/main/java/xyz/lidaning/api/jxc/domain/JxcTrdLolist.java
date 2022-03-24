package xyz.lidaning.api.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 损益详情对象 jxc_trd_lolist
 *
 * @date 2021-02-23
 */

@Data
public class JxcTrdLolist{
    private static final long serialVersionUID = 1L;

    /**
     * #!|ID
     */
    private String id;

    /**
     * 损益单号
     */

    private String lono;

    /**
     * 填表时间
     */


    private Date entertime;

    /**
     * 商品编码
     */

    private String goodcode;

    /**
     * 商品标准编码
     */

    private String goodstdcode;

    /**
     * 商品类型
     */

    private String goodtype;

    /**
     * 药品名称
     */

    private String drugname;

    /**
     * 商品名称
     */

    private String goodname;

    /**
     * 生产厂家
     */

    private String factory;

    /**
     * 批号
     */

    private String batchno;

    /**
     * 生产日期
     */


    private Date mftdate;

    /**
     * 有效期
     */


    private Date usefuldate;

    /**
     * 损溢类型
     */

    private Long lotype;

    /**
     * 数量
     */

    private Long quantity;

    /**
     * 单位
     */

    private String unit;

    /**
     * 价格
     */

    private Long price;

    /**
     * 是否拆零单位
     */

    private Long isretailunit;

    /**
     * 合计金额
     */

    private Long totalamt;

    /**
     * 损溢理由
     */

    private String loreason;

    /**
     * 不合格附检验报告
     */

    private String lorept;

    /**
     * 业务部门意见
     */

    private String saledeptopinion;

    /**
     * 质量部门意见
     */

    private String qltydeptopinion;

    /**
     * 财务部门意见
     */

    private String fdeptopinion;

    /**
     * 经理意见
     */

    private String mngeropinion;

    /**
     * 经理ID
     */

    private Long mngerid;

    /**
     * 经理
     */

    private String mngername;

    /**
     * 仓库主管ID
     */

    private Long masterid;

    /**
     * 仓库主管
     */

    private String mastername;

    /**
     * 保管员ID
     */

    private Long stkerid;

    /**
     * 保管员
     */

    private String stkername;

    /**
     * 是否同意报损
     */

    private Long ispass;

    /**
     * 审批日期
     */


    private Date chkdate;

    /**
     * $column.columnComment
     */

    private String moncode;

    /**
     * 包装级别
     */

    private Long packlevel;

    /**
     * 包装比例
     */

    private Long packrate;

    /**
     * 审核状态
     */

    private Long chkstate;

    /**
     * 首次审核时间
     */


    private Date firstchktime;

    /**
     * 调整提交时间
     */


    private Date adjsubmittime;

    /**
     * #!|上传状态
     */

    private Long rptstatus;

    /**
     * #!|上传文件
     */

    private String rptfilename;

    /**
     * 本位码
     */

    private String gbcode;

    /**
     * 最小含量单位
     */

    private String minunit;

    /**
     * 最小含量
     */

    private Long minunitcount;

    /**
     * 转换比
     */

    private Long convertrate;

    /**
     * #!|上报前状态
     */

    private Long rptbeforestatus;

    /**
     * 生产日期
     */

    private String mftdateex;

    /**
     * 有效期
     */

    private String usefuldateex;

    /**
     * $column.columnComment
     */

    private String style;

    /**
     * 拆零比例
     */

    private Long retailrate;

    /**
     * 剂型
     */

    private String doestype;

    /**
     * 检验报告人ID
     */

    private Long lorepterid;

    /**
     * 业务部门审核人ID
     */

    private Long saledeptopinionerid;

    /**
     * 质量部门审核人ID
     */

    private Long qltydeptopinionerid;

    /**
     * 财务部门审核人ID
     */

    private Long fdeptopinionerid;

    /**
     * 检验报告人
     */

    private String lorepter;

    /**
     * 业务部门审核人
     */

    private String saledeptopinioner;

    /**
     * 质量部门审核人
     */

    private String qltydeptopinioner;

    /**
     * 财务部门审核人
     */

    private String fdeptopinioner;

    /**
     * 创建时间
     */

    private String createtime;

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

    private String pid;

}
