package cn.bill.quartz.configuration;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.bill.quartz.service.ICronService;

/**
 * Description: 自启动程序配置<br/>
 * Date:2018年9月12日 上午11:31:01 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@Configuration
public class AutoStartConfiguration
{
	@Autowired
	QuartzManager quartzManager;
	@Autowired
	private ICronService iCronService;
	/**
	 * 自启动定时器任务
	 * @return
	 * @throws SchedulerException 
	 */
	@Bean
	public boolean startQuartzTask()
	{
		try
		{
			if(quartzManager!=null)
			{
				System.out.println("自启动QuartzTask成功");
				quartzManager.start(iCronService.findByCronId("1"));
				quartzManager.start(iCronService.findByCronId("2"));
				quartzManager.start(iCronService.findByCronId("3"));
			}
		} catch (SchedulerException e)
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
}
