/**
 * The Zeffit is a character whose purpose is to attack Groks and eliminate them.
 * When Zeffits take a hit, they turn green.  When they take a second hit, Zeffits turn blue.
 * When they take a third hit, Zeffits turn red.  The fourth hit makes them explode in a fiery
 * death!
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class Zeffit
{
    boolean isAlive = true;
    int hitsTaken = 0;
    // TODO: add final variables

    // TODO: add instance variable(s)

    /**
     * Constructor for objects of class Zeffit
     */
    public Zeffit()
    {
        isAlive = true;
        hitsTaken = 0;
        // TODO: initialize instance variable(s)
    }

    /**
     * Inflicts or registers a hit on this Zeffit.
     *
     */
    public void takesHit()
    {
        hitsTaken++;
        isGreen();
        isBlue();
        isRed();
        isDead();
        // TODO: replace this line with your code
    }

    /**
     * Indicates whether this Zeffit has taken no hits
     *
     * @return    true if this Zeffit has taken no hits; false otherwise.
     */
    public boolean isHitFree()
    {
        if (hitsTaken == 0){
            return true;
        }
        return false;
        // TODO: replace this line with your code
    }

    /**
     * Indicates whether this Zeffit has taken a hit
     *
     * @return    true if this Zeffit has taken a hit; false otherwise.
     */
    public boolean isGreen()
    {
        if (hitsTaken == 1){
            return true;
        }
        return false;
        // TODO: replace this line with your code
    }

    /**
     * Indicates whether this Zeffit has taken two hits
     *
     * @return    true if this Zeffit has taken two hits; false otherwise.
     */
    public boolean isBlue()
    {
        if (hitsTaken == 2){
            return true;
        }
        return false;
        // TODO: replace this line with your code
    }

    /**
     * Indicates whether this Zeffit has taken three hits
     *
     * @return    true if this Zeffit has taken three hits; false otherwise.
     */
    public boolean isRed()
    {
        if (hitsTaken == 3){
            return true;
        }
        return false;
        // TODO: replace this line with your code
    }

    /**
     * Indicates whether this Zeffit has exploded in a fiery death!
     *
     * @return    true if this Zeffit is dead; false otherwise.
     */
    public boolean isDead()
    {
        if (hitsTaken > 3){
            isAlive = !isAlive;
        }
        return isAlive;
        // TODO: replace this line with your code
    }
}

