package cn.bill.quartz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.bill.quartz.entity.CronEntity;
/**
 * Description: 表达式管理器Mapper接口<br/>
 * Date:2018年9月12日 上午10:41:15 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
public interface CronMapper{
 @Select("select * from cron_table where id = #{id}")
 @Results({
 @Result(property = "id", column = "id"),
 @Result(property = "userId", column = "user_id"),
 @Result(property = "cron", column = "cron"),
 @Result(property = "quarzName", column = "quarz_name"),
 @Result(property = "schedulerClass", column = "scheduler_class"),
 @Result(property = "time", column = "time")
 })
 CronEntity load(String id);
 @Insert("insert into cron_table(id,userId,cron,quartzName,schedulerClass,time)" +
 "values(#{id},#{user_id},#{cron},#{quartz_name},#{scheduler_class},# {time})")
 void insert(CronEntity cronEntity);
 
 @Select("select * from cron_table")
 @Results({
 @Result(property = "id", column = "id"),
 @Result(property = "userId", column = "user_id"),
 @Result(property = "cron", column = "cron"),
 @Result(property = "quarzName", column = "quarz_name"),
 @Result(property = "schedulerClass", column = "scheduler_class"),
 @Result(property = "time", column = "time")
 })
 List<CronEntity> queryAll();
 @Update("update cron_table set cron=#{1} where id =#{0}")
 void updateCron(String id,String cron);
}