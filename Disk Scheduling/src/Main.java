import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, start;
        ArrayList<Integer> q = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Integer num = 0;
        System.out.println("Enter The number of Requests: ");
        n = sc.nextInt();
        System.out.println("Enter The Requests: ");
        for(int i=0; i<n; i++)
        {
            num = sc.nextInt();
            q.add(num);
        }
        while (true)
        {
            System.out.println("1- First Come First Serve Algorithm.\n2- Shortest Seek Time First Algorithm.\n3- The Optimized Real Time Algorithm.\n4- Exit");
            num = sc.nextInt();
            if(num == 4)
                break;
            else if(num == 1)
            {
                System.out.println("Enter The HeadStart: ");
                start = sc.nextInt();
                FCFS fcfs = new FCFS(q, start);
                fcfs.ViewFCFS();
                System.out.println("The Total Head Movement: "+fcfs.CalculateHeadMoves());
            }
            else if(num == 2)
            {
                System.out.println("Enter The HeadStart: ");
                start = sc.nextInt();
                SSTF sstf = new SSTF(q, start);
                ArrayList<Integer> res = new ArrayList<>();
                res = sstf.Allocation();
                sstf.View(res);
                System.out.println("The Total Head Movement: "+sstf.CalculatTotalMoves(res));
            }
            else if(num == 3)
            {
                OptimizedRealTime op = new OptimizedRealTime(q);
                ArrayList<Integer> res = new ArrayList<>();
                res = op.Allocation();
                op.View();
                System.out.println("The Total Head Movement: "+op.CalculateTotalMoves());

            }
        }
    }
}
