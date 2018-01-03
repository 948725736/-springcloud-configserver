package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * 啟用分佈式配置中心  讀取遠程git倉庫獲取配置
 * 所有spring的配置中心的配置文件 都有以下幾種格式組成
 *  1 配置文件属于哪个应用的 (application)
 *  2 配置文件属于哪个阶段 (profile) 开发阶段 测试阶段 产品阶段
 *  3 在git仓库中哪个分支下 （label）
 *  
 * 
 * 
 * 
 * @author Administrator
 *
 */
@EnableConfigServer
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
