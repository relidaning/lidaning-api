package xyz.lidaning.api.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 销售信息详情对象 jxc_trd_salelist
 *
 * @date 2021-02-23
 */
@Data
public class JxcTrdSalelist{
    private static final long serialVersionUID = 1L;

    /**
     * #!|ID
     */
    private String id;

    /**
     * 销售单号
     */

    private String saleno;

    /**
     * 交易时间
     */


    private Date trdtime;

    /**
     * 商品码
     */

    private String goodcode;

    /**
     * 商品标准码
     */

    private String goodstdcode;

    /**
     * 本位码
     */

    private String gbcode;

    /**
     * 商品类型
     */

    private Long goodtype;

    /**
     * 商品条码
     */

    private String goodbarcode;

    /**
     * 商品名称
     */

    private String goodname;

    /**
     * 产品名称
     */

    private String productname;

    /**
     * 生产厂家名称
     */

    private String factory;

    /**
     * 助记码
     */

    private String docode;

    /**
     * 剂型
     */

    private String doestype;

    /**
     * 规格
     */

    private String style;

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
     * 是否进口
     */

    private Long isimport;

    /**
     * 生产地址
     */

    private String factoryaddr;

    /**
     * 药品分类
     */

    private Long drgtype;

    /**
     * 批准文号
     */

    private String apvno;

    /**
     * 是否为拆零
     */

    private Long isretail;

    /**
     * 单位
     */

    private String unit;

    /**
     * 数量
     */

    private Long quantity;

    /**
     * 单价
     */

    private Long price;

    /**
     * 实收总价
     */

    private Long payment;

    /**
     * 提成金额
     */

    private Long commamt;

    /**
     * 积分数
     */

    private Long integral;

    /**
     * 处方单用药分类
     */

    private Long rcpdrgtype;

    /**
     * 社保编码
     */

    private String sbno;

    /**
     * 医保药分类
     */

    private String ybdrgtype;

    /**
     * 经营范围分类
     */

    private String rxtype;

    /**
     * 销售人员ID
     */

    private Long sellerid;

    /**
     * 会员ID
     */

    private Long memberid;

    /**
     * 交易方式(1：收银销售，2：处方销售，3：积分兑换)
     */

    private Long dealtype;

    /**
     * 销售类型
     */

    private String saletype;

    /**
     * 赠品对应购买商品编码
     */

    private String giftgoodcode;

    /**
     * 收银员ID
     */

    private Long operid;

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
     * 处方单GUID
     */

    private String rcpid;

    /**
     * #!|上传前状态
     */

    private Long rptbeforestatus;

    /**
     * 监管码
     */

    private Long moncode;

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
     * 生产日期
     */

    private String mftdateex;

    /**
     * 有效期
     */

    private String usefuldateex;

    /**
     * 监管类型
     */

    private String montype;

    /**
     * 购买人姓名
     */

    private String rxsalename;

    /**
     * 身份证号
     */

    private String identitycard;

    /**
     * 拆零比例
     */

    private Long retailrate;

    /**
     * 成本
     */

    private Long cost;

    /**
     * 社保药，药品且条码枪扫入
     */

    private Long isybdrug;

    /**
     * 打折积分状态 0：默认；1：积分不打折；2：打折不积分
     */
    private Long discountintegralstate;

    private Date synctime;
    private String substatus;
    private String failreason;

    private String pid;


}
