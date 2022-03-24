package xyz.lidaning.api.jxc.mapper;

import xyz.lidaning.api.jxc.domain.JxcTrdChklist;

import java.util.List;

/**
 * 盘点信息详情Mapper接口
 *
 * @date 2021-02-23
 */
public interface JxcTrdChklistMapper
{
    /**
     * 查询盘点信息详情
     *
     * @param id 盘点信息详情ID
     * @return 盘点信息详情
     */
    public JxcTrdChklist selectJxcTrdChklistById(String id);

    /**
     * 查询盘点信息详情列表
     *
     * @param jxcTrdChklist 盘点信息详情
     * @return 盘点信息详情集合
     */
    public List<JxcTrdChklist> selectJxcTrdChklistList(JxcTrdChklist jxcTrdChklist);

    /**
     * 新增盘点信息详情
     *
     * @param jxcTrdChklist 盘点信息详情
     * @return 结果
     */
    public int insertJxcTrdChklist(JxcTrdChklist jxcTrdChklist);

    /**
     * 修改盘点信息详情
     *
     * @param jxcTrdChklist 盘点信息详情
     * @return 结果
     */
    public int updateJxcTrdChklist(JxcTrdChklist jxcTrdChklist);

    /**
     * 修改盘点信息详情
     *
     * @param jxcTrdChklist 盘点信息详情
     * @return 结果
     */
    public int updateJxcTrdChklistByPrimaryKey(JxcTrdChklist jxcTrdChklist);

    /**
     * 删除盘点信息详情
     *
     * @param id 盘点信息详情ID
     * @return 结果
     */
    public int deleteJxcTrdChklistById(String id);

    /**
     * 批量删除盘点信息详情
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcTrdChklistByIds(String[] ids);


    /**
     * 返回查询盘点信息详情总量
     *
     * @param jxcTrdChklist 盘点信息详情
     * @return 盘点信息详情查询总量
     */
    public Integer selectJxcTrdChklistCount(JxcTrdChklist jxcTrdChklist);
}
