package cn.bill.quartz.service;

import java.util.List;

import cn.bill.quartz.entity.CronEntity;

/**
 * 
 * Description: 表达式管理器Service接口<br/>
 * Date:2018年9月12日 上午10:42:45 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
public interface ICronService
{
	void sendEmail(String quartzName);

	void sendSms(String quartzName);

	CronEntity findByCronId(String id);

	void update(CronEntity cronEntity);

	List<CronEntity> findAll();
}