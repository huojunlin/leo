package cn.mine.leo.tbox.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.mine.leo.util.AppConfig;



public class TcpServer {

	private static final Logger log = LoggerFactory.getLogger(TcpServer.class);
	
	public static void main(String[] args) {
		log.info("Starts to load configuration information.");
		AppConfig.configure(TcpServer.class.getResource("/appconfig.xml").getFile());
		log.info("Configuration information is loaded.");
		
		final int port = Integer.parseInt(AppConfig.getParameter("port"));
		final int lengthFieldOffset = Integer.parseInt(AppConfig.getParameter("lengthFieldOffset"));
		final int lengthFieldLength = Integer.parseInt(AppConfig.getParameter("lengthFieldLength"));
		final int lengthAdjustment = Integer.parseInt(AppConfig.getParameter("lengthAdjustment"));
		final int initialBytesToStrip = Integer.parseInt(AppConfig.getParameter("initialBytesToStrip"));
		
		final String serviceUrl = AppConfig.getParameter("serviceUrl");
		
		log.info("Listening Port: " + port);
		log.info("Address Of Service Processing: " + serviceUrl);
	}
}
