package lzw.mode.singletonmode;

// ���򣺼򵥵����������
// �����ļ���Server.java

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ServerLink 
{

/**
 * TCP�ļ����˿�
 */
public static final int TCP_PORT = 6633;

private RequestControl control=RequestControl.getInstance();
/**
 * UDP�ļ����˿�
 */
public static final int UDP_PORT = 6666;
/**
 * �ͻ���� ��ID
 */
  private int ID=0;
  public ServerLink(){
	  //control=RequestControl.getInstance();
   }     
  
public void start() {
	 
		System.out.println("ServerLink.start():�ȴ�������..."); 
	 
	   }
}
