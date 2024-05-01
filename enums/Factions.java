package enums;

public enum Factions {




    TheSiegemaster("The Siegemaster", "Northen Realms", "play impenetrable fog"),

    TheSteelForged("The Steel-Forged", "Northen Realms", "remove weather,impenetrable fog,Biting Frost Torrential Rain"),

    KingofTemeria("King of Temeria", "Northen Realms", "siege power *2"),
    LordCommanderoftheNorth("Lord Commander of the North", "Northen Realms", "kill the max power of stage"),

    SonofMedell("Son of Medell", "Northen Realms", "kill the max power of ranged"),

    TheWhiteFlame("The Steel-Forged", "Nilfgaardian Empire", "Torrential Rain"),

    HisImperialMajesty("His Imperial Majesty", "Nilfgaardian Empire", "see 3 card random from enemy"),


    EmperorofNilfgaard("Emperor of Nilfgaard", "Nilfgaardian Empire", "canceling the ability of enemy ruler"),

    TheRelentless("The Relentless", "Nilfgaardian Empire", "get a dead card of enemy"),

    InvaderoftheNorth("Invader of the North", "Nilfgaardian Empire", "get a random dead card of enemy"),


    BringerofDeath("Bringer of Death", "Monsters", "2* colse combat"),
    KingofthewildHunt("King of the wild Hunt", "Monsters", "get a dead card of me"),

    DestroyerofWorlds("Destroyer of Worlds", "Monsters", "get a new card from deck card"),

    CommanderoftheRedRiders("Commander of the Red Riders", "Monsters", "play a weather card"),

    TheTreacherous("The Treacherous", "Monsters", "spy * 2"),
    QueenofDolBlathanna("Queen of Dol Blathanna", "Scoia’taell", "if close Combat>10 kill ranged card"),

    TheBeautiful("The Beautiful", "Scoia’taell", "power ranged combat*2"),

    DaisyoftheValley("Daisy of the Valley", "Scoia’taell", "get a random card"),

    PurebloodElf("Pureblood Elf", "Scoia’taell", "play a Biting Frost"),

    HopeoftheAenSeidhe("Hope of the Aen Seidhe", "Scoia’taell", "max power agile unit"),

    CrachanCraite("Crach an Craite", "Skellige", "get dead cards"),

    KingBran("King Bran", "Skellige", "power soldiers/2 in weather situation");


    private String name;
    private String faction;
    private String ability;

    Factions(String name, String faction, String ability) {
        this.name = name;
        this.ability = ability;
        this.faction = faction;
    }

    public String getName() {
        return name;
    }

    public String getFaction() {
        return faction;
    }

    public String getAbility() {
        return ability;
    }
}