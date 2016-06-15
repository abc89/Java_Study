package lzw.mode.observeradvance;

import java.lang.reflect.Method;

public class EntrustEvent {
	    //Ҫִ�з����Ķ���   
	    private Object object;   
	    //Ҫִ�еķ�������   
	    private String methodName;   
	    //Ҫִ�з����Ĳ���   
	    private Object[] params;   
	    //Ҫִ�з����Ĳ�������   
	    private Class[] paramTypes;   
	       
	    public EntrustEvent(){   
	           
	    }   
	    public EntrustEvent(Object object,String methodName,Object...args){   
	        this.object=object;   
	        this.methodName=methodName;   
	        this.params=args;   
	        contractParamTypes(this.params);   
	    }   
	    //���ݲ����������ɲ�����������   
	    private void contractParamTypes(Object[] params){   
	        this.paramTypes=new Class[params.length];   
	        for(int i=0;i<params.length;i++){   
	            this.paramTypes[i]=params[i].getClass();   
	        }   
	    }   
	       
	    public Object getObject() {   
	        return object;   
	    }   
	                     //����setter getterʡ��   
	    public void setParamTypes(Class[] paramTypes) {   
	        this.paramTypes = paramTypes;   
	    }   
	    //ִ�и� ����ĸ÷���   
	    public void invoke() throws Exception{   
	        Method method=object.getClass().getMethod(this.getMethodName(), this.getParamTypes());   
	        if(null==method){   
	            return;   
	        }   
	        method.invoke(this.getObject(), params);   
	    }
	    //ʹ�ø÷�������,���ز��������Objectcuowu?
//		private Object getParams() {
//			
//			return params;
//		}
		private Class[] getParamTypes() {
			
			return paramTypes;
		}
		private String getMethodName() {
			
			return methodName;
		}   
	 
}
