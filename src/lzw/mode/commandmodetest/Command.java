package lzw.mode.commandmodetest;

    abstract class Command {
    	protected Receiver receiver;
    	protected String commandMsg;//ִ�е�����
    	public Command(Receiver receiver,String msg){
    		this.receiver=receiver;
    		this.commandMsg=msg;
    	}
     abstract void execute();
    	
}
