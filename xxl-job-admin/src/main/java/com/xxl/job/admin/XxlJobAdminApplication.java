package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import java.net.InetAddress;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
public class XxlJobAdminApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext application = SpringApplication.run(XxlJobAdminApplication.class, args);
		Environment env = application.getEnvironment();
		String port = env.getProperty("server.port");
		String path = env.getProperty("server.servlet.context-path");
		path = StringUtils.hasText(path) ? path : "";

		System.out.println("\n----------------------------------------------------------\n\t" +
				"application is running! Access URLs:\n\t" +
				"Local: \t\thttp://localhost:" + port + path + "/\n\t" +
				"----------------------------------------------------------");
	}

}
