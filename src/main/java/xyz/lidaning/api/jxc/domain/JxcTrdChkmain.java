package xyz.lidaning.api.jxc.domain;

import lombok.Data;

import java.util.Date;

/**
 * 盘点信息对象 jxc_trd_chkmain
 *
 * @date 2021-02-23
 */
@Data
public class JxcTrdChkmain{
    private static final long serialVersionUID = 1L;

    /**
     * 盘点单号
     */

    private String chkno;

    /**
     * 盘点时间
     */


    private Date chktime;

    /**
     * 盘点方式
     */

    private Long chktype;

    /**
     * 盘点人ID
     */

    private Long chkstaffid;

    /**
     * 盘点人
     */

    private String chkstaffname;

    /**
     * 价格类型
     */

    private Long pricetype;

    /**
     * 状态
     */

    private Long state;

    /**
     * 并入盘点单
     */

    private String intochkno;

    /**
     * 生效状态
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
     * 批次总金额
     */

    private Long totalamt;

    /**
     * 差异总金额
     */

    private Long difftotalamt;

    /**
     * 销售总金额
     */

    private Long saletotalamt;

    /**
     * id
     */
    private String id;

    private String remark;

}
