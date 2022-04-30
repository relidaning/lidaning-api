package xyz.lidaning.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 召回详情对象 jxc_gsp_drugrecalllist
 *
 * @date 2021-02-23
 */
@Data
public class JxcGspDrugrecalllist{
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private String id;

    /**
     * 购买人
     */

    private String purchaser;

    /**
     * 购买日期
     */


    private Date purchaserdate;

    /**
     * 购买数量
     */

    private Long purchaserquantity;

    /**
     * 召回数量
     */

    private Long recallquantity;

    /**
     * 使用数量
     */

    private Long usequantity;

    /**
     * 用药后不良反应
     */

    private String adversereaction;

    /**
     * 联系方式
     */

    private String telephone;

    /**
     * 召回主单号
     */

    private String drno;

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
