package lzw.mode.singletonmode;

// 程序：简单的联机服务端
// 范例文件：Server.java

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 单例 模式 递归调用 分析
 * @author e7691
 *
 */
public class DanliDiGui 
{
private static ViewControl vc=ViewControl.getInstance();
static{
	System.out.println("server vc:"+vc);
}

   public DanliDiGui(){
	   startServer();
   }
   public static void main(String args[])
   {
	   new DanliDiGui();
   }
   private void startServer() {
	  vc.start();
	    }	     
}
