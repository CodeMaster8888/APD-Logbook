package processes;

/**
 * One version of the process --- assign y+1 to x.
 */
public class Process1 extends Process {
    int temp;

    public void run()
    {
        x = y + 1;
    }
}
