import java.io.Console;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    static Timer timer = new Timer();
    static int segundos=10;
    public static void main(String[] args)
    {
        System.out.println("Aperte qualquer tecla para começar");
        
        TimerTask tarefa = new TimerTask()
        {
            public void run()
            {
                segundos = segundos-1;
                System.out.println("Faltam "+segundos+" segundos");
                if(segundos==0)
                {
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(tarefa, 0,1000);
    }
}
