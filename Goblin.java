public class Goblin extends Enemies
{
    //Instance Variables
    private int numClaws;
    //Constructor
    public Goblin (boolean hasClaws, int numClaws)
    {
        super(hasClaws);
        this.numClaws = numClaws;
    }

    //Getters and Setters

    public int getNumClaws() {
        return numClaws;
    }

    public void setNumClaws(int numClaws) {
        this.numClaws = numClaws;
    }

    //Brain Methods

    //ToString
    public String toString()
    {
        String output = super.toString();
               output += "\nThis Goblin has " + numClaws + " claws.\n";
        return output;
    }
}//end Goblin Class
