package xyz.lidaning.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 退回入库详情对象 jxc_trd_rtninlist
 *
 * @ 2021-02-23
 */
@Data
public class JxcTrdRtninlist{
    private static final long serialVersionUID = 1L;

    /**
     * #!|ID
     */
    private String id;

    /**
     * 退货单号
     */

    private String rtnno;

    /**
     * 退货时间
     */


    private Date rtntime;

    /**
     * 客户ID
     */

    private Long clientid;

    /**
     * 客户
     */

    private String clientname;

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

    private Long goodtype;

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
     * 退货原因
     */

    private String rtnrsn;

    /**
     * 预处理
     */

    private String pretreatment;

    /**
     * 处理结果
     */

    private String result;

    /**
     * 质量状况
     */

    private String qltycase;

    /**
     * 验收结论
     */

    private String verifyrst;

    /**
     * 监管码
     */

    private Long moncode;

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
     * #!|上传状态
     */

    private Long rptstatus;

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
     * 商品积分
     */

    private Long integral;

    /**
     * 批次价格
     */

    private Long cost;

    /**
     * 剂型
     */

    private String doestype;

    /**
     * 提成金额
     */

    private Long commamt;

    /**
     * 销售人员ID
     */

    private Long sellerid;

    /**
     * 创建时间
     */

    private Date createtime;

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
