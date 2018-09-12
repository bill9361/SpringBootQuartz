package cn.bill.quartz.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: 保存在数据库中的表达式管理器<br/>
 * Date:2018年9月12日 上午10:38:23 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@SuppressWarnings("serial")
public class CronEntity implements Serializable
{
	private String id;
	private String userId; // 用户标识
	private String cron; // 表达式
	private String quarzName; // 任务名称
	private String schedulerClass;// 定时任务类
	private Date time;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getCron()
	{
		return cron;
	}

	public void setCron(String cron)
	{
		this.cron = cron;
	}

	public String getQuarzName()
	{
		return quarzName;
	}

	public void setQuarzName(String quarzName)
	{
		this.quarzName = quarzName;
	}

	public String getSchedulerClass()
	{
		return schedulerClass;
	}

	public void setSchedulerClass(String schedulerClass)
	{
		this.schedulerClass = schedulerClass;
	}

	public Date getTime()
	{
		return time;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

	@Override
	public String toString()
	{
		return "CronEntity [id=" + id + ", userId=" + userId + ", cron=" + cron + ", quarzName=" + quarzName
				+ ", schedulerClass=" + schedulerClass + ", time=" + time + "]";
	}

}