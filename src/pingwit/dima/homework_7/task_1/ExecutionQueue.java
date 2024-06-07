package pingwit.dima.homework_7.task_1;


public class ExecutionQueue {
    private static String msg;

    static {
        msg = "static block";
    }

    {
        msg = "regular init block";
    }

    public ExecutionQueue() {
        msg = "construktor value";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();

        System.out.println(executionQueue.msg);
    }
}
