package xyz.lidaning.jxc.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 批次库存对象 jxc_good_batch
 *
 * @date 2021-02-23
 */
@Data
public class JxcGoodBatch {
    private static final long serialVersionUID = 1L;

    /**
     * #!|ID
     */
    private String id;

    /**
     * 商品编码
     */

    private String goodcode;

    /**
     * 标准商品编码
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
     * 有效期
     */


    private Date usefuldate;

    /**
     * 库存
     */

    private Long stkqty;

    /**
     * 拆零库存
     */

    private Long retailsstkqty;

    /**
     * 最新进价
     */

    private BigDecimal newpurcprice;

    /**
     * 最新拆零进价
     */

    private BigDecimal newretailspurcprice;

    /**
     * 首次插入时间
     */


    private Date firstcreatetime;

    /**
     * 最后修改时间
     */


    private Date lastmdftime;

    /**
     * 是否有效
     */

    private Long status;

    /**
     * 最新巡查养护日期
     */


    private Date commonmtdate;

    /**
     * 最新重点养护日期
     */


    private Date majormtdate;

    /**
     * 最新效期养护日期
     */


    private Date usefulmtdate;

    /**
     * 生产日期
     */

    private String mftdateex;

    /**
     * 有效期
     */

    private String usefuldateex;

    /**
     * 生产日期精度
     */

    private Long mftdateaccuracy;

    /**
     * 有效期精度
     */

    private Long validperiodaccuracy;

    /**
     * 最近购进时间
     */


    private Date latelybuytime;

    /**
     * 最近销售时间
     */


    private Date latelysaletime;

    /**
     * 成本价格
     */

    private BigDecimal cost;

    /**
     * 拆零成本价格
     */

    private BigDecimal retailcost;

    private String corpid;

}
