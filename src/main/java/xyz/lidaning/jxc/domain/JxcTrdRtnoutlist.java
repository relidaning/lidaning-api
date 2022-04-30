package xyz.lidaning.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 退回出库详情对象 jxc_trd_rtnoutlist
 *
 * @date 2021-02-23
 */

@Data
public class JxcTrdRtnoutlist{
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
     * $column.columnComment
     */

    private String supplierid;

    /**
     * 供应商
     */

    private String suppliername;

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
     * 状态
     */

    private Long state;

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
     * 剂型
     */

    private String doestype;

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
