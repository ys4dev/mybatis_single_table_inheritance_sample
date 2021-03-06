package sample.domain.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sample.domain.model.Parent;
import sample.domain.model.ParentExample;

public interface ParentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    long countByExample(ParentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int deleteByExample(ParentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int insert(Parent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int insertSelective(Parent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    List<Parent> selectByExampleWithBLOBs(ParentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    List<Parent> selectByExample(ParentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    Parent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Parent record, @Param("example") ParentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Parent record, @Param("example") ParentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Parent record, @Param("example") ParentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Parent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Parent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parent
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Parent record);
}