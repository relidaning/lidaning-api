package xyz.lidaning.jxc.mapper;

import xyz.lidaning.jxc.domain.JxcGoodBaseinfo;

import java.util.List;

/**
 * 药品信息Mapper接口
 *
 * @date 2021-02-23
 */
public interface JxcGoodBaseinfoMapper
{
    /**
     * 查询药品信息
     *
     * @param id 药品信息ID
     * @return 药品信息
     */
    public JxcGoodBaseinfo selectJxcGoodBaseinfoById(String id);

    /**
     * 查询药品信息列表
     *
     * @param jxcGoodBaseinfo 药品信息
     * @return 药品信息集合
     */
    public List<JxcGoodBaseinfo> selectJxcGoodBaseinfoList(JxcGoodBaseinfo jxcGoodBaseinfo);

    /**
     * 新增药品信息
     *
     * @param jxcGoodBaseinfo 药品信息
     * @return 结果
     */
    public int insertJxcGoodBaseinfo(JxcGoodBaseinfo jxcGoodBaseinfo);

    /**
     * 修改药品信息
     *
     * @param jxcGoodBaseinfo 药品信息
     * @return 结果
     */
    public int updateJxcGoodBaseinfo(JxcGoodBaseinfo jxcGoodBaseinfo);

    /**
     * 修改药品信息
     *
     * @param jxcGoodBaseinfo 药品信息
     * @return 结果
     */
    public int updateJxcGoodBaseinfoByPrimaryKey(JxcGoodBaseinfo jxcGoodBaseinfo);

    /**
     * 删除药品信息
     *
     * @param id 药品信息ID
     * @return 结果
     */
    public int deleteJxcGoodBaseinfoById(String id);

    /**
     * 批量删除药品信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJxcGoodBaseinfoByIds(String[] ids);


    /**
     * 返回查询药品信息总量
     *
     * @param jxcGoodBaseinfo 药品信息
     * @return 药品信息查询总量
     */
    public Integer selectJxcGoodBaseinfoCount(JxcGoodBaseinfo jxcGoodBaseinfo);
}
