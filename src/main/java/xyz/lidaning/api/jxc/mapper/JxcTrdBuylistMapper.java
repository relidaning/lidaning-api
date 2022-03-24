package xyz.lidaning.api.jxc.mapper;


import xyz.lidaning.api.jxc.domain.JxcTrdBuylist;

import java.util.List;

/**
 * 购进详情Mapper接口
 *
 * @date 2021-02-23
 */
public interface JxcTrdBuylistMapper
{
    /**
     * 查询购进详情
     *
     * @param id 购进详情ID
     * @return 购进详情
     */
    public JxcTrdBuylist selectJxcTrdBuylistById(String id);

    /**
     * 查询购进详情列表
     *
     * @param jxcTrdBuylist 购进详情
     * @return 购进详情集合
     */
    public List<JxcTrdBuylist> selectJxcTrdBuylistList(JxcTrdBuylist jxcTrdBuylist);

    /**
     * 新增购进详情
     *
     * @param jxcTrdBuylist 购进详情
     * @return 结果
     */
    public int insertJxcTrdBuylist(JxcTrdBuylist jxcTrdBuylist);

    /**
     * 修改购进详情
     *
     * @param jxcTrdBuylist 购进详情
     * @return 结果
     */
    public int updateJxcTrdBuylist(JxcTrdBuylist jxcTrdBuylist);

    /**
     * 修改购进详情
     *
     * @param jxcTrdBuylist 购进详情
     * @return 结果
     */
    public int updateJxcTrdBuylistByPrimaryKey(JxcTrdBuylist jxcTrdBuylist);

    /**
     * 删除购进详情
     *
     * @param id 购进详情ID
     * @return 结果
     */
    public int deleteJxcTrdBuylistById(String id);

    /**
     * 批量删除购进详情
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcTrdBuylistByIds(String[] ids);


    /**
     * 返回查询购进详情总量
     *
     * @param jxcTrdBuylist 购进详情
     * @return 购进详情查询总量
     */
    public Integer selectJxcTrdBuylistCount(JxcTrdBuylist jxcTrdBuylist);
}
