package xyz.lidaning.api.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 损益信息对象 jxc_trd_lomain
 *
 * @d2021-02-23
 */

@Data
public class JxcTrdLomain{
    private static final long serialVersionUID = 1L;

    /**
     * 损益单号
     */

    private String lono;

    /**
     * 填表时间
     */


    private Date entertime;

    /**
     * 处理结果
     */

    private String result;

    /**
     * 总额
     */

    private Long totalamt;

    /**
     * 审核状态
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
     * 录入时间
     */


    private Date maketime;

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
     * 是否使用监管码
     */

    private Long ismoncode;

    /**
     * 销毁执行人
     */

    private String destroyexecutor;

    /**
     * 销毁执行人证件号码
     */

    private String destroyexecutornum;

    /**
     * 销毁监督人
     */

    private String destroysupervisor;

    /**
     * 销毁监督人证件号码
     */

    private String destroysupervisornum;

    /**
     * 销毁原因
     */

    private String destroyreason;

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

    private String whereCouse;

    private String corpid;

    private String remark;

}
