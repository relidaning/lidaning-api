package xyz.lidaning.api.jxc.domain;

import lombok.Data;

import java.util.Date;

/**
 * 销售信息对象 jxc_trd_salemain
 *
 * @date 2021-02-23
 */
@Data
public class JxcTrdSalemain {
    private static final long serialVersionUID = 1L;

    /**
     * 销售单号
     */


    private String saleno;

    /**
     * 交易方式(1：收银销售，2：处方销售,3：积分兑换)
     */


    private Long dealtype;

    /**
     * 交易时间
     */


    private Date trdtime;

    /**
     * 处方单号
     */


    private String rcpno;

    /**
     * 应收额
     */


    private Long dueamt;

    /**
     * 优惠额
     */


    private Long favorableamt;

    /**
     * 实收额
     */


    private Long payment;

    /**
     * 支付类型
     */


    private Long paytype;

    /**
     * 社保报销金额
     */


    private Long sbpayamt;

    /**
     * 个人支付金额
     */


    private Long perpayamt;

    /**
     * 会员ID
     */


    private Long memberid;

    /**
     * 收银员ID
     */


    private Long operid;

    /**
     * 收银员姓名
     */


    private String opername;

    /**
     * 操作时间
     */


    private Date opertime;

    /**
     * #!|上传状态
     */


    private Long rptstatus;

    /**
     * #!|上传文件
     */


    private String rptfilename;

    /**
     * #!|上传前状态
     */


    private Long rptbeforestatus;

    /**
     * 积分数
     */


    private Long integral;

    /**
     * 收银金额
     */


    private Long revamt;

    /**
     * 监管码上报文件生成状态
     */


    private Long isbuildmcdfile;

    /**
     * 购买人姓名
     */


    private String rxsalename;

    /**
     * 身份证号
     */


    private String identitycard;

    /**
     * 中心业务号
     */


    private String businumber;

    /**
     * 社保账号
     */


    private String ssnumber;

    /**
     * 状态(1-正常,0-医保退入)
     */


    private Long state;

    /**
     * 证件类型
     */


    private Long idtype;

    /**
     * 客户证件号码
     */


    private String clientcard;

    /**
     * 是否使用监管码
     */


    private Long ismoncode;

    /**
     * 打折比例
     */


    private Long discount;

    /**
     * 抹零金额
     */


    private Long malingamt;

    /**
     * 中心就诊流水号
     */


    private String hospitalnumber;

    /**
     * 是否使用微信支付
     */


    private Long iswechatpay;

    /**
     * 微信支付金额
     */


    private Long wechatpayamt;

    /**
     * 结算流水序号
     */


    private String settlementnumber;

    /**
     * 手机号码
     */


    private String mobile;

    /**
     * 备用字段1
     */


    private String var1;

    /**
     * 备用字段2
     */


    private String var2;

    /**
     * 备用字段3
     */


    private String var3;

    /**
     * ID
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
