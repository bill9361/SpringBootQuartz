package cn.bill.quartz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bill.quartz.entity.CronEntity;
import cn.bill.quartz.mapper.CronMapper;
import cn.bill.quartz.service.ICronService;
/**
 * Description: 表达式管理器Service实现类<br/>
 * Date:2018年9月12日 上午10:43:29 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@Service
public class CronServiceImpl implements ICronService
{
	@Autowired
	private CronMapper cronMapper;

	@Override
	public void sendEmail(String quartzName)
	{
		System.out.println(quartzName + " 正在发送邮件");
	}

	@Override
	public void sendSms(String quartzName)
	{
		System.out.println(quartzName + "正在发送短信");
	}

	@Override
	public CronEntity findByCronId(String id)
	{
		return this.cronMapper.load(id);
	}

	@Override
	public void update(CronEntity cronEntity)
	{
		this.cronMapper.insert(cronEntity);
	}

	@Override
	public List<CronEntity> findAll()
	{
		return this.cronMapper.queryAll();
	}
}