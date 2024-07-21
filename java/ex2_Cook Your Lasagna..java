public class Lasagna {

    public int expectedMinutesInOven()
    {
        return 40;
    }

     public int remainingMinutesInOven(int time)
    {
        return this.expectedMinutesInOven() - time;
    }

    public int preparationTimeInMinutes(int layers)
    {
        return 2 * layers;
    }
    
    public int totalTimeInMinutes(int layers, int minutes)
    {    
        int layersTime = this.preparationTimeInMinutes(layers);
        int totalTime = layersTime + minutes;
        return totalTime;
    }
}