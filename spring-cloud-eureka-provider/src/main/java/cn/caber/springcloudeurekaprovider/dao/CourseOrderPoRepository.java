package cn.caber.springcloudeurekaprovider.dao;

import cn.caber.springcloudeurekaprovider.po.CourseOrderPo;
import cn.caber.springcloudeurekaprovider.po.SeqOrderedPo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CourseOrderPoRepository {

    @Select("select * from course_order  where id= #{id}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "orderNo", column = "order_no"),
            @Result(property = "realName", column = "real_name"),
            @Result(property = "courseName", column = "course_name"),
            @Result(property = "courseId", column = "course_id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "courseTime", column = "course_time"),
            @Result(property = "courseNum", column = "course_num"),
            @Result(property = "paymentAmount", column = "payment_amount"),
            @Result(property = "paymentStatus", column = "payment_status"),
            @Result(property = "evaluationStatus", column = "evaluation_status"),
            @Result(property = "isdel", column = "isdel")}
    )
    CourseOrderPo findById(Integer id);

    @Select("select * from course_order")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "orderNo", column = "order_no"),
            @Result(property = "realName", column = "real_name"),
            @Result(property = "courseName", column = "course_name"),
            @Result(property = "courseId", column = "course_id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "courseTime", column = "course_time"),
            @Result(property = "courseNum", column = "course_num"),
            @Result(property = "paymentAmount", column = "payment_amount"),
            @Result(property = "paymentStatus", column = "payment_status"),
            @Result(property = "evaluationStatus", column = "evaluation_status"),
            @Result(property = "isdel", column = "isdel")}
    )
    List<CourseOrderPo> findAll();

    @Insert("INSERT INTO course_order(user_id,real_name,course_name,course_id,create_time,course_time,course_num," +
            "payment_amount,payment_status,evaluation_status,isdel,order_no) VALUES(#{userId},#{realName},#{courseName},#{courseId}" +
            ",#{createTime},#{courseTime},#{courseNum},#{paymentAmount},#{paymentStatus},#{evaluationStatus}," +
            "#{isdel},#{orderNo})")
    @Results(value = {
//            @Result(property = "id", column = "id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "orderNo", column = "order_no"),
            @Result(property = "realName", column = "real_name"),
            @Result(property = "courseName", column = "course_name"),
            @Result(property = "courseId", column = "course_id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "courseTime", column = "course_time"),
            @Result(property = "courseNum", column = "course_num"),
            @Result(property = "paymentAmount", column = "payment_amount"),
            @Result(property = "paymentStatus", column = "payment_status"),
            @Result(property = "evaluationStatus", column = "evaluation_status"),
            @Result(property = "isdel", column = "isdel")}
    )
    void save(CourseOrderPo sq);

    void delete(CourseOrderPo sq);

 /*   @Modifying
    @Query(value = "update course_order c set c.id=?2 where id=?1",nativeQuery = true)
    SeqOrderedPo update(SeqOrderedPo sq);*/
}
