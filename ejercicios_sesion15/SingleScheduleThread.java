import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.List;

public class SingleScheduleThread{

	public static void main(String args[]) throws Exception{
		ScheduledExecutorService service = null;
		service = Executors.newSingleThreadScheduledExecutor();
		
		Runnable task1 = () -> {
			try{
				System.out.println("task1");
				Thread.sleep(2000);				
			}catch(Exception ex){
				
			}
		};
		Callable<String> call1 = () -> {
			System.out.println("callable");
			return "result";
		};
		//ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
		ScheduledFuture<?> r2 = service.schedule(call1, 8, TimeUnit.SECONDS);

		//service.scheduleAtFixedRate(task1, 2, 3, TimeUnit.SECONDS);
		//service.scheduleWithFixedDelay(task1, 2, 3, TimeUnit.SECONDS);
		//service.scheduleWithFixedDelay(task1, 0, 8, TimeUnit.SECONDS);
		System.out.println("end");
		
	}

}