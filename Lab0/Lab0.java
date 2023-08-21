// name: 
// date:
// per:  

public class Lab0
{

    public Lab0()
    {
        // do not update the constructor
    }

    public  void display (int min, int max)
    {
        for(int i = min; i <= max; i++){
            System.out.println(checkValue(i));
        }
    }

    public String checkValue(int val)
    {
        if(val % 3 == 0 && val % 5 == 0){
            return "Pokemon";
        }
        if(val % 3 == 0){
            return "Poke";
        }
        if(val % 5 == 0){
            return "mon";
        }
        return Integer.toString(val);
    }
}
