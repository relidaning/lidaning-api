package xyz.lidaning.api.jxc.service;

import xyz.lidaning.api.jxc.domain.JxcSCorpinfo;

import java.util.List;

/**
 * jxcSCorpinfoService接口
 * @date 2021-02-23
 */
public interface IJxcSCorpinfoService
{
    /**
     * 查询jxcSCorpinfo
     *
     * @param id jxcSCorpinfoID
     * @return jxcSCorpinfo
     */
    public JxcSCorpinfo selectJxcSCorpinfoById(String id);

    /**
     * 查询jxcSCorpinfo列表
     *
     * @param jxcSCorpinfo jxcSCorpinfo
     * @return jxcSCorpinfo集合
     */
    public List<JxcSCorpinfo> selectJxcSCorpinfoList(JxcSCorpinfo jxcSCorpinfo);

    /**
     * 新增jxcSCorpinfo
     *
     * @param jxcSCorpinfo jxcSCorpinfo
     * @return 结果
     */
    public int insertJxcSCorpinfo(JxcSCorpinfo jxcSCorpinfo);

    /**
     * 修改jxcSCorpinfo
     *
     * @param jxcSCorpinfo jxcSCorpinfo
     * @return 结果
     */
    public int updateJxcSCorpinfo(JxcSCorpinfo jxcSCorpinfo);

    /**
     * 批量删除jxcSCorpinfo
     *
     * @param ids 需要删除的jxcSCorpinfoID
     * @return 结果
     */
    public int deleteJxcSCorpinfoByIds(String[] ids);

    /**
     * 删除jxcSCorpinfo信息
     *
     * @param id jxcSCorpinfoID
     * @return 结果
     */
    public int deleteJxcSCorpinfoById(String id);

    /**
     * 返回查询jxcSCorpinfo总量
     *
     * @param jxcSCorpinfo jxcSCorpinfo
     * @return jxcSCorpinfo查询总量
     */
    public Integer selectJxcSCorpinfoCount(JxcSCorpinfo jxcSCorpinfo);
}
