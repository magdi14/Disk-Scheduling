import java.util.*;

public class FCFS {
    public ArrayList<Integer> input = new ArrayList<>();
    public ArrayList<Integer> inpCopy;
    private Integer StartHead;

    public FCFS(ArrayList<Integer> input, Integer startHead) {
        this.input = input;
        StartHead = startHead;
        inpCopy = new ArrayList<>(input);
        Collections.copy(inpCopy,input);
    }
    public Integer CalculateHeadMoves()
    {
        Integer TotalMoves = 0;
        for(Integer item=0; item<inpCopy.size()-1; item++)
        {   Integer temp = 0;
           if(inpCopy.get(item+1)>=inpCopy.get(item))
               temp = inpCopy.get(item+1) - inpCopy.get(item);
           else
               temp = inpCopy.get(item) - inpCopy.get(item+1);
           TotalMoves+=temp;
        }
        return TotalMoves+(inpCopy.get(0) - StartHead);
    }
    public void ViewFCFS()
    {
        System.out.print(StartHead+" -> ");
        for(Integer i = 0; i<inpCopy.size(); i++)
        {
            System.out.print(inpCopy.get(i)+" -> ");
            if(i+1==inpCopy.size()-1)
            {
                System.out.print(inpCopy.get(i+1)+"\n");
                break;
            }
        }


    }

}
