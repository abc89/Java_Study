package lzw.mode.singletonmode2;

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
private static ViewControl vc;

   public DanliDiGui(){
	   vc=ViewControl.getInstance();
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
