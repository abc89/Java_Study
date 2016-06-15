package lzw.mode.singletonmode;

// 程序：简单的联机服务端
// 范例文件：Server.java

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ServerLink 
{

/**
 * TCP的监听端口
 */
public static final int TCP_PORT = 6633;

private RequestControl control=RequestControl.getInstance();
/**
 * UDP的监听端口
 */
public static final int UDP_PORT = 6666;
/**
 * 客户标记 ：ID
 */
  private int ID=0;
  public ServerLink(){
	  //control=RequestControl.getInstance();
   }     
  
public void start() {
	 
		System.out.println("ServerLink.start():等待联机中..."); 
	 
	   }
}
