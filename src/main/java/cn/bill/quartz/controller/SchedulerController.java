package cn.bill.quartz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scheduler")
public class SchedulerController
{
	/*@Autowired
	QuartzManager quartzManager;*/

	@RequestMapping("/start")
	@ResponseBody
	public String start(@RequestParam(name = "id", defaultValue = "") String id)
	{
		/*try
		{
			quartzManager.start(id);
		} catch (SchedulerException e)
		{
			e.printStackTrace();
		}*/
		return "启动成功";
	}
}