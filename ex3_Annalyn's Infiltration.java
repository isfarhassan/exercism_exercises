class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFree = false;
        if (petDogIsPresent)
        {
            if (archerIsAwake == false) 
            {
                canFree = true;
            }
        }else
        {
            if (prisonerIsAwake && (archerIsAwake == false && knightIsAwake == false))
            {
                canFree = true;
            }
        }
    return canFree;
    }
}