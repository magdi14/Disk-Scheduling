import java.util.ArrayList;
import java.util.Collections;

public class OptimizedRealTime {
    public ArrayList<Integer> input = new ArrayList<>();
    public ArrayList<Integer> inpCopy;
    public Integer StartHead;

    public OptimizedRealTime(ArrayList<Integer> input) {
        this.input = input;
        inpCopy = new ArrayList<>(input);
        Collections.copy(inpCopy,input);
        StartHead = 0;
        inpCopy.add(0,StartHead);
    }
    public ArrayList<Integer> Allocation()
    {
        Collections.sort(inpCopy);
        return inpCopy;
    }
    public Integer CalculateTotalMoves()
    {
        Integer res = 0;
        int sze = inpCopy.size();
        for(int i=0; i<sze-1; i++)
            res+= (inpCopy.get(i+1)-inpCopy.get(i));
        return res;
    }
    public void View()
    {
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
