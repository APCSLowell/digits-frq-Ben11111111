import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	int count = 0; 
        if(num == 0)
        digitList.add(0);
        int temp = num;
        while(temp > 0){
	digitList.add(0,temp%10);
	temp = temp/10;
	}
	}
	

	public boolean isStrictlyIncreasing()
	{ 
	for(int i = 0; i < digitList.size()-1;i++)
        if(digitList.get(i+1) <= digitList.get(i))
        return false;
        return true;
		

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
