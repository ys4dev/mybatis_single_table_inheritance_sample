package sample.domain.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sample.domain.model.Child;
import sample.domain.model.ChildExample;

public interface ChildMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    long countByExample(ChildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int deleteByExample(ChildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int insert(Child record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int insertSelective(Child record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    List<Child> selectByExampleWithBLOBs(ChildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    List<Child> selectByExample(ChildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    Child selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Child record, @Param("example") ChildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Child record, @Param("example") ChildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Child record, @Param("example") ChildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Child record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Child record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table child
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Child record);
}