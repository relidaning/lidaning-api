package xyz.lidaning.api.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 召回信息对象 jxc_gsp_drugrecallmain
 *
 * @date 2021-02-23
 */
@Data
public class JxcGspDrugrecallmain{
    private static final long serialVersionUID = 1L;

    /**
     * 药品召回主单号
     */

    private String drno;

    /**
     * 药品召回日期
     */


    private Date drdate;

    /**
     * 药品名称
     */

    private String goodname;

    /**
     * 规格
     */

    private String style;

    /**
     * 单位
     */

    private String unit;

    /**
     * 生产厂家
     */

    private String factory;

    /**
     * 批号
     */

    private String batchno;

    /**
     * 召回原因
     */

    private String reason;

    /**
     * 召回级别
     */

    private String drlevel;

    /**
     * 召回方式
     */

    private String methods;

    /**
     * 召回总数量
     */

    private Long quantity;

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

    private String remark;

}
