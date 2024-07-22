
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
  
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasNoBirds = false;
        for(int count_of_zero_birds : birdsPerDay)
            {
                if (count_of_zero_birds == 0)
                {
                    hasNoBirds = true;
                    break;
                }
            }
        return hasNoBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if (numberOfDays <= birdsPerDay.length -1)
        {
        for (int i = 0; i < numberOfDays; i++)
            {
                count += birdsPerDay[i];
            }
        }
        else{
        for(int per_day : birdsPerDay)
            {
                count += per_day;
            }
        }

        return count;
    }

    public int getBusyDays() {
        int countBusyDays = 0;
        for (int day : birdsPerDay)
            {
                if (day >= 5)
                    countBusyDays++;
            }
        return countBusyDays;
    }
}