package cn.bill.quartz.configuration;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
			System.out.println("初始化QuartzTaskStartBean，并启动定时器");
			System.out.println("quartzManager==null::"+(quartzManager==null));
			quartzManager.start("1");
			quartzManager.start("2");
		} catch (SchedulerException e)
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
}
