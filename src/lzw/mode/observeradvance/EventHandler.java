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

   //添加某个对象要执行的事件，及需要的参数   
   public void addEvent(Object object,String methodName,Object...args){   
       events.add(new EntrustEvent(object,methodName,args));   
   }
   
   public void removeEvent(int index){
	   events.remove(index);
   }
   //通知所有的对象执行指定的事件   
   public void notifyEveryOne() throws Exception{   
       for(EntrustEvent e : events){   
           e.invoke();   
       }   
   }   
   
}
