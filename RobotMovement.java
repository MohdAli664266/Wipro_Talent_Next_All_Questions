package wipro_talent_next;

public class RobotMovement
{
    public static String robotMovement(int input1, int input2, String input3, String input4)
    {
        String[] position = input3.split("-");
        int x = Integer.parseInt(position[0]);
        int y = Integer.parseInt(position[1]);
        String d = position[2];
        String[] instructions = input4.split(" ");
        String error="";
        String result ="";
        boolean flag = false;
        for(String ins:instructions)
        {
            if(ins.equals("R"))
            {
                if(d.equals("E"))
                {
                    d = "S";
                }else if(d.equals("N"))
                {
                    d = "E";
                }else if(d.equals("W"))
                {
                    d = "N";
                }else if(d.equals("S"))
                {
                    d = "W";
                }
            }
            if(ins.equals("L"))
            {
                if(d.equals("E"))
                {
                    d = "N";
                }else if(d.equals("N"))
                {
                    d = "W";
                }else if(d.equals("W"))
                {
                    d = "S";
                }else if(d.equals("S"))
                {
                    d = "E";
                }
            }
            if(ins.equals("M"))
            {
                if(d.equals("E"))
                {
                    if(x<input1)
                    {
                        x +=1;
                    }else
                    {
                        flag = true;
                        error = "ER";
                    }
                }else if(d.equals("W"))
                {
                    if(x>0)
                    {
                        x -=1;
                    }else
                    {
                        flag = true;
                        error = "ER";
                    }
                }else if(d.equals("N"))
                {
                    if(y<input2)
                    {
                        y +=1;
                    }else
                    {
                        flag = true;
                        error = "ER";
                    }
                }else if(d.equals("S"))
                {
                    if(y>0)
                    {
                        y -=1;
                    }else
                    {
                        flag = true;
                        error = "ER";
                    }
                }
            }
        }
        if(flag)
        {
            result = String.valueOf(x+""+"-"+y+""+"-"+d+"-"+error);
        }else
        {
            result = String.valueOf(x+""+"-"+y+""+"-"+d);
        }
        return result;
    } 
    public static void main(String[] args) {
        String value = robotMovement(3, 3, "3-3-E", "R M L M L M R M"); // with Error
        // String value = robotMovement(3, 3, "3-3-E", "R M L M");
        System.out.println(value);
    }   
}
