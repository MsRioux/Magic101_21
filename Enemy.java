public abstract class Enemies
{
    private boolean hasClaws;

    public Enemies (boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }

    @Override
    public String toString() {
        return "This bad boy has claws? " + hasClaws;
    }
}
