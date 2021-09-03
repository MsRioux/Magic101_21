public class MagicDriver
{
    public static void main(String[] args)
    {
        Goblin kyle = new Goblin(true,5);
        Goblin gerome = new Goblin(false, 0);

        System.out.println(kyle.toString());
        kyle.setNumClaws(7);
        System.out.println("Now Kyle has " + kyle.getNumClaws() + " Claws.");

        Enemies[] myEnemies = {kyle, gerome};

        for(int i=0; i <myEnemies.length; i++)
        {
           System.out.println(myEnemies[i]);
        }


    }
}//end driver
