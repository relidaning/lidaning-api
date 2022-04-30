package xyz.lidaning.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 追溯码信息对象 jxc_trd_moncode
 *
 * @date 2021-02-23
 */
@Data
public class JxcTrdMoncode{
    private static final long serialVersionUID = 1L;

    /**
     * #!|ID
     */
    private String id;

    /**
     * 交易单号
     */

    private String trdno;

    /**
     * 交易明细ID
     */

    private String trdid;

    /**
     * 监管码
     */

    private String moncode;

    /**
     * 数量
     */

    private Long quantity;

    /**
     * 商品码
     */

    private String goodcode;

    /**
     * 单据时间
     */


    private Date billtime;

    /**
     * 同步时间
     */


    private Date synctime;

    private String corpid;

    private String whereCouse;

}
