package lzw.mode.commandmode;

    abstract class Command {
    	protected Receiver receiver;
    	public Command(Receiver receiver){
    		this.receiver=receiver;
    	}
     abstract void execute();
    	
}
