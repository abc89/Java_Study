package lzw.mode.observeradvance;

import java.util.ArrayList;
import java.util.List;

public class EventHandler  {
   private List<EntrustEvent> events=null;
   public List<EntrustEvent> getEvents() {
	return events;
}
public EventHandler(){   
       events=new ArrayList<EntrustEvent>();   
   }  

   //���ĳ������Ҫִ�е��¼�������Ҫ�Ĳ���   
   public void addEvent(Object object,String methodName,Object...args){   
       events.add(new EntrustEvent(object,methodName,args));   
   }
   
   public void removeEvent(int index){
	   events.remove(index);
   }
   //֪ͨ���еĶ���ִ��ָ�����¼�   
   public void notifyEveryOne() throws Exception{   
       for(EntrustEvent e : events){   
           e.invoke();   
       }   
   }   
   
}
