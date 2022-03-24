package xyz.lidaning.api.jxc.domain;

import lombok.Data;

import java.util.Date;

/**
 * 盘点信息详情对象 jxc_trd_chklist
 *
 * @date 2021-02-23
 */
@Data
public class JxcTrdChklist{
    private static final long serialVersionUID = 1L;

    /**
     * #!|ID
     */
    private String id;

    /**
     * 盘点单号
     */

    private String chkno;

    /**
     * 盘点时间
     */


    private Date chktime;

    /**
     * 商品编码
     */

    private String goodcode;

    /**
     * 商品标准码
     */

    private String goodstdcode;

    /**
     * 批号
     */

    private String batchno;

    /**
     * 生产日期
     */


    private Date mftdate;

    /**
     * 有效日期
     */


    private Date usefuldate;

    /**
     * 盘点仓位编码
     */

    private String chkstkno;

    /**
     * 系统整包装数量
     */

    private Long sysqty;

    /**
     * 实盘整包装数量
     */

    private Long actualqty;

    /**
     * 差异整包装数量
     */

    private Long diffqty;

    /**
     * 价格
     */

    private Long price;

    /**
     * 最新进价
     */

    private Long newpurcprice;

    /**
     * 零售价
     */

    private Long saleprice;

    /**
     * 系统拆零数量
     */

    private Long sysretailqty;

    /**
     * 实盘拆零数量
     */

    private Long actualretailqty;

    /**
     * 差异拆零数量
     */

    private Long diffretailqty;

    /**
     * 拆零价格
     */

    private Long actualprice;

    /**
     * 最新拆零进价
     */

    private Long newretailpurcprice;

    /**
     * 拆零价
     */

    private Long retailprice;

    /**
     * 合计金额
     */

    private Long totalamt;

    /**
     * 首次审核时间
     */


    private Date firstchktime;

    /**
     * 调整提交时间
     */


    private Date adjsubmittime;

    /**
     * 生产厂家
     */

    private String factory;

    /**
     * 商品名称
     */

    private String goodname;

    /**
     * 差异合计金额
     */

    private Long difftotalamt;

    /**
     * 生效状态
     */

    private Long chkstate;

    /**
     * 是否新增批次
     */

    private Long isnewbatch;

    /**
     * 货架号
     */

    private String shelfno;

    /**
     * !#|是否盘点单所选批次
     */

    private Long isselectbatch;

    /**
     * 生产日期
     */

    private String mftdateex;

    /**
     * 有效期
     */

    private String usefuldateex;

    /**
     * 包装规格
     */

    private String style;

    /**
     * 顺序号
     */

    private Long chksqo;

    /**
     * 生产日期精度
     */

    private Long mftdateaccuracy;

    /**
     * 有效日期精度
     */

    private Long validperiodaccuracy;

    /**
     * 原批次进价
     */

    private Long oldprice;

    private String pid;

}
