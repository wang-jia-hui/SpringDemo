package cn.mayongfa.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 业务相关的作业调度
 * 
           字段               允许值                           允许的特殊字符
	秒	 	0-59	 	, - * /
	分	 	0-59	 	, - * /
	小时	 	0-23	 	, - * /
	日期	 	1-31	 	, - * ? / L W C
	月份	 	1-12 或者 JAN-DEC	 	, - * /
	星期	 	1-7 或者 SUN-SAT	 	, - * ? / L C #
	年（可选）	 	留空, 1970-2099	 	, - * /
	
	*  字符代表所有可能的值
	/  字符用来指定数值的增量
	L  字符仅被用于天（月）和天（星期）两个子表达式，表示一个月的最后一天或者一个星期的最后一天
	6L 可以表示倒数第６天
	
 *
 */
@Component
public class GlodQuartz {

	/**
	 * 用户自动加金币
	 * 每天凌晨一点执行一次
	 */
	@Scheduled(cron = "0 0 1 * * ? ")
	public void addUserGold() {
		System.out.println("凌晨一点了，你睡了么？");
	}
	/**
	 * 每隔5秒定时清理缓存
	 */
	@Scheduled(cron = "*/5 * * * * ? ")
	public void cacheClear() {
		//System.out.println("时间又过去5秒了，真令人伤感...");
	}
}
