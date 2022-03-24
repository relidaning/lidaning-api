package xyz.lidaning.api.jxc.service;


import xyz.lidaning.api.jxc.domain.JxcTrdSalelist;

import java.util.List;

/**
 * 销售信息详情Service接口
 * @date 2021-02-23
 */
public interface IJxcTrdSalelistService
{
    /**
     * 查询销售信息详情
     *
     * @param id 销售信息详情ID
     * @return 销售信息详情
     */
    public JxcTrdSalelist selectJxcTrdSalelistById(String id);

    /**
     * 查询销售信息详情列表
     *
     * @param jxcTrdSalelist 销售信息详情
     * @return 销售信息详情集合
     */
    public List<JxcTrdSalelist> selectJxcTrdSalelistList(JxcTrdSalelist jxcTrdSalelist);

    /**
     * 新增销售信息详情
     *
     * @param jxcTrdSalelist 销售信息详情
     * @return 结果
     */
    public int insertJxcTrdSalelist(JxcTrdSalelist jxcTrdSalelist);

    /**
     * 修改销售信息详情
     *
     * @param jxcTrdSalelist 销售信息详情
     * @return 结果
     */
    public int updateJxcTrdSalelist(JxcTrdSalelist jxcTrdSalelist);

    /**
     * 批量删除销售信息详情
     *
     * @param ids 需要删除的销售信息详情ID
     * @return 结果
     */
    public int deleteJxcTrdSalelistByIds(String[] ids);

    /**
     * 删除销售信息详情信息
     *
     * @param id 销售信息详情ID
     * @return 结果
     */
    public int deleteJxcTrdSalelistById(String id);

    /**
     * 返回查询销售信息详情总量
     *
     * @param jxcTrdSalelist 销售信息详情
     * @return 销售信息详情查询总量
     */
    public Integer selectJxcTrdSalelistCount(JxcTrdSalelist jxcTrdSalelist);
}
