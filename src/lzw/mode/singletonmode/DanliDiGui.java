package lzw.mode.singletonmode;

// ���򣺼򵥵����������
// �����ļ���Server.java

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ���� ģʽ �ݹ���� ����
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
