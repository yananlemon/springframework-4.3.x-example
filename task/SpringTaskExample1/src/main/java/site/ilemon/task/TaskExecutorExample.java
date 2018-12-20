package site.ilemon.task;

import org.springframework.core.task.TaskExecutor;

/**
 * TaskExecutorExample
 * @author andy
 */
public class TaskExecutorExample{
    
	private TaskExecutor taskExecutor;
	
	public TaskExecutorExample(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}
	
	public void printMessage(){
		for (int i = 0; i < 19; i++) {
			this.taskExecutor.execute(new MessagePrinter("msg" + i));
		}
	}
}

class MessagePrinter implements Runnable{
	String msg;
	public MessagePrinter(String msg){
		this.msg = msg;
	}
	@Override
	public void run() {
		System.out.println(msg);
	}
}
