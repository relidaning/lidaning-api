package xyz.lidaning.api.jxc.domain;


import lombok.Data;

import java.util.Date;

/**
 * 药品信息对象 jxc_good_baseinfo
 *
 * @date 2021-02-23
 */
@Data
public class JxcGoodBaseinfo {
    private static final long serialVersionUID = 1L;

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
     * 大分类
     */

    private String btype;

    /**
     * 中类
     */

    private String mitype;

    /**
     * 小类
     */

    private String subtype;

    /**
     * 条形码
     */

    private String goodbarcode;

    /**
     * 商品名称
     */

    private String goodname;

    /**
     * 通用名
     */

    private String productname;

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
     * 效期/月
     */

    private Long usemonth;

    /**
     * 是否进口
     */

    private Long isimport;

    /**
     * 生产厂家
     */

    private String factory;

    /**
     * 生产地址
     */

    private String factoryaddr;

    /**
     * $column.columnComment
     */

    private String factorydocode;

    /**
     * 生产日期精确度
     */

    private Long mftdateaccuracy;

    /**
     * 有效期精确度
     */

    private Long validperiodaccuracy;

    /**
     * 药品分类
     */

    private Long drugtype;

    /**
     * 批准文号
     */

    private String apvno;

    /**
     * 结算方式
     */

    private Long stmtype;

    /**
     * 品类
     */

    private String category;

    /**
     * 是否可拆零
     */

    private Long iscanretail;

    /**
     * 最新进价
     */

    private Long newpurcprice;

    /**
     * 最新拆零进价
     */

    private Long newretailpurcprice;

    /**
     * 零售价
     */

    private Long saleprice;

    /**
     * 主单位
     */

    private String unit;

    /**
     * 拆零单位
     */

    private String retailunit;

    /**
     * 拆零比例
     */

    private Long retailrate;

    /**
     * 拆零价
     */

    private Long retailprice;

    /**
     * 最低售价
     */

    private Long minsaleprice;

    /**
     * 库存
     */

    private Long stkqty;

    /**
     * 拆零库存
     */

    private Long retailstkqty;

    /**
     * 会员价
     */

    private Long memberprice;

    /**
     * 老年人价
     */

    private Long oprice;

    /**
     * 特价起始日期
     */


    private Date spcpricefdate;

    /**
     * 特价结束日期
     */


    private Date spcpricetdate;

    /**
     * 日特价价格
     */

    private Long dayspcprice;

    /**
     * 日特价限购数量
     */

    private Long dayspclmtqty;

    /**
     * 时段特价起始时间
     */

    private String timespcstart;

    /**
     * 时段特价结束时间
     */

    private String timespcend;

    /**
     * 时段特价价格
     */

    private Long timeprice;

    /**
     * 时段特价限购数量
     */

    private Long timespclmtqty;

    /**
     * 采购周期
     */

    private Long purcperiod;

    /**
     * 最低采购量
     */

    private Long minpurcqty;

    /**
     * 最大库存
     */

    private Long maxstcqty;

    /**
     * 最小库存
     */

    private Long minstcqty;

    /**
     * 仓位号
     */

    private String stkno;

    /**
     * 货架号
     */

    private String shelfno;

    /**
     * 限购数量
     */

    private Long lmtpurcqty;

    /**
     * 积分系数
     */

    private Long graderate;

    /**
     * 提成方式
     */

    private Long commmethod;

    /**
     * 提成数
     */

    private Long commqty;

    /**
     * 是否可优惠
     */

    private Long isfavourable;

    /**
     * 处方单用药分类
     */

    private Long rcpdrgtype;

    /**
     * 社保编号
     */

    private String sbno;

    /**
     * 医保药分类
     */

    private Long ybdrgtype;

    /**
     * 注册证号
     */

    private String regno;

    /**
     * 生产企业许可证号
     */

    private String prdctionlcsno;

    /**
     * 注册商标
     */

    private String regmarks;

    /**
     * 检验报告
     */

    private String chkrpt;

    /**
     * 主要成份
     */

    private String inpart;

    /**
     * 储存条件
     */

    private Long storagecdtion;

    /**
     * 是否有中文说明书
     */

    private Long ischinareame;

    /**
     * 是否通过首营审批
     */

    private Long isfirstapvtable;

    /**
     * 经营范围分类
     */

    private String rxtype;

    /**
     * 养护方式
     */

    private Long curingway;

    /**
     * 状态
     */

    private Long state;

    /**
     * 维护标识
     */

    private Long maintanceflag;

    /**
     * 最小单位
     */

    private String minunit;

    /**
     * 最小单位含量
     */

    private Long minunitcount;

    /**
     * 包装数量
     */

    private Long convertrate;

    /**
     * 添加类型
     */

    private Long addtype;

    /**
     * 是否进行过拆零交易
     */

    private Long hasretailtrd;

    /**
     * $column.columnComment
     */

    private String basestyle;

    /**
     * 修改时间
     */


    private Date edittime;

    /**
     * 修改人ID
     */

    private Long edituserid;

    /**
     * 修改人姓名
     */

    private String editusername;

    /**
     * 监管类型
     */

    private String montype;

    /**
     * 盘点单号
     */

    private String chkno;

    /**
     * 是否参与打折
     */

    private Long isdiscount;

    /**
     * 日特价
     */

    private Long specialoffervalue;

    /**
     * 特价日集合
     */

    private String specialofferlist;

    /**
     * 特殊药品类型
     */

    private Long specialdrgtype;

    /**
     * 大中小分类是否已更新
     */

    private Long isupdateBms;

    /**
     * 商品ABC分类
     */

    private String abcstate;

    /**
     * 批准文号、注册证号有效期至
     */


    private Date apvnovalidity;

    /**
     * 禁忌药品
     */

    private String incompatibility;

    /**
     * 国家限价
     */

    private Long fixedprice;

    /**
     * 成本价格
     */

    private Long cost;

    /**
     * 拆零成本价格
     */

    private Long retailcost;

    /**
     * 医院收费项目内码
     */

    private String projectcode;

    /**
     * 是否可以线上交易
     */

    private Long isonlinetrading;

    /**
     * 是否有监管码
     */

    private Long ismoncode;

    /**
     * 上市许可持有人
     */

    private String holder;

    /**
     * 是否已匹配上传信息
     */

    private Long isupmath;

    /**
     * 慢病价格
     */

    private Long chronicprice;

    private String corpid;

    private String id;

    private Date createtime;


}
