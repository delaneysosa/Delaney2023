import java.util.*;

public class MSMBreeding {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Map<String, String[]> offspringMap = new HashMap<>();
    offspringMap.put("Reebro Arackulele", new String[] {"Clamble", "Rare"});
    offspringMap.put("Shugitar Arackulele", new String[] {"Grumpyre", "Legendary"});
    offspringMap.put("Jellbilly Arackulele", new String[] {"Jeeode", "Common"});
    offspringMap.put("Shugabush Bogart", new String[] {"Shrubb", "Legendary"});
    offspringMap.put("Fung Pray Boodoo", new String[] {"Blabbit", "Common"});


offspringMap.put("Reebro Arackulele", new String[] {"Clamble", "Rare"});
offspringMap.put("Shugitar Arackulele", new String[] {"Grumpyre", "Legendary"});
offspringMap.put("Jellbilly Arackulele", new String[] {"Jeeode", "Common"});
offspringMap.put("Shugabush Bogart", new String[] {"Shrubb", "Legendary"});
offspringMap.put("Fung Pray Boodoo", new String[] {"Blabbit", "Common"});
offspringMap.put("Punkleton Bowgart", new String[] {"T-Rox", "Limited"});
offspringMap.put("Riff Congle", new String[] {"Noggin", "Common"});
offspringMap.put("Grumpyre Deedge", new String[] {"Congle", "Rare"});
offspringMap.put("Clamble Drumpler", new String[] {"Potbelly", "Common"});
offspringMap.put("Shugabeats Entbrat", new String[] {"Mammott", "Legendary"});
offspringMap.put("Yool Entbrat", new String[] {"Potbelly", "Limited"});
offspringMap.put("Ghazt Entbrat", new String[] {"T-Rox", "Rare"});
offspringMap.put("Shrubb Furcorn", new String[] {"Noggin", "Common"});
offspringMap.put("Pummel Fwog", new String[] {"Potbelly", "Common"});
offspringMap.put("Whisp Ghazt", new String[] {"Grumpyre", "Rare"});
offspringMap.put("Nebulob Ghazt", new String[] {"Reebro", "Rare"});
offspringMap.put("Kazilleon Grumpyre", new String[] {"Humbug", "Common"});
offspringMap.put("BooDoo Grumpyre", new String[] {"Jeeode", "Rare"});
offspringMap.put("Arackulele Grumpyre", new String[] {"Reebro", "Rare"});
offspringMap.put("Dragong Jeeode", new String[] {"Clamble", "Common"});
offspringMap.put("Drumpler Noggin", new String[] {"Mammot", "Common"});
offspringMap.put("Fwog Noggin", new String[] {"Toe Jammer", "Common"});
offspringMap.put("Furcorn Potbelly", new String[] {"Mammot", "Common"});
offspringMap.put("Bowgart Potbelly", new String[] {"Maw", "Common"});
offspringMap.put("T-Rox Potbelly", new String[] {"Maw", "Common"});
offspringMap.put("Shugarock Potbelly", new String[] {"Quarrister", "Legendary"});
offspringMap.put("Shugajo Potbelly", new String[] {"Riff", "Legendary"});
offspringMap.put("Oaktapus Potbelly", new String[] {"Toe Jammer", "Common"});
offspringMap.put("Entbrat Potbelly", new String[] {"T-Rox", "Common"});
offspringMap.put("G'joob Pummel", new String[] {"T-Rox", "Common"});
offspringMap.put("Shugabuzz Quarrister", new String[] {"Bellowfish", "Legendary"});
offspringMap.put("Hoola Quarrister", new String[] {"Clamble", "Limited"});
offspringMap.put("Humbug Quarrister", new String[] {"Scups", "Common"});
offspringMap.put("Bellowfish Reebro", new String[] {"Jeeode", "Rare"});
offspringMap.put("Quarrister Reedling", new String[] {"Mammott", "Common"});
offspringMap.put("Jeeode Reedling", new String[] {"Shellbeat", "Rare"});
offspringMap.put("Sox Riff", new String[] {"Entbrat", "Common"});
offspringMap.put("Shugabass Shugabass", new String[] {"Potbelly", "Legendary"});
offspringMap.put("Shellbeat Spunge", new String[] {"Noggin", "Common"});
offspringMap.put("Blabbit Spunge", new String[] {"Scups", "Limited"});
offspringMap.put("Shugavox Toe Jammer", new String[] {"Entbrat", "Common"});
offspringMap.put("Maw Toe Jammer", new String[] {"Mammot", "Common"});
offspringMap.put("Deedge Tweedle", new String[] {"Bogart", "Common"});
offspringMap.put("PomPom Tweedle", new String[] {"Drumpler", "Common"});
offspringMap.put("Thumpies Tweedle", new String[] {"Furcorn", "Common"});
offspringMap.put("Scups Tweedle", new String[] {"Fwog", "Common"});
offspringMap.put("Pango Tweedle", new String[] {"Mammot", "Common"});
offspringMap.put("Congle Tweedle", new String[] {"Maw", "Common"});
offspringMap.put("Cybop Tweedle", new String[] {"Noggin", "Common"});
offspringMap.put("Spunge Tweedle", new String[] {"Oaktapus", "Common"});
offspringMap.put("Dandidoo Tweedle", new String[] {"Potbelly", "Common"});
offspringMap.put("Schmoochle Tweedle", new String[] {"Riff", "Limited"});
offspringMap.put("Reedling Tweedle", new String[] {"Shrubb", "Common"});
offspringMap.put("Quibble Tweedle", new String[] {"Toe Jammer", "Common"});


    // Add the rest of the combinations and rarities here

    System.out.print("Enter Parent 1: ");
    String parent1 = input.nextLine();
    System.out.print("Enter Parent 2: ");
    String parent2 = input.nextLine();
    String key = parent1 + " " + parent2;

    if (offspringMap.containsKey(key)) {
      System.out.println("Offspring: " + offspringMap.get(key)[0]);
      System.out.println("Rarity: " + offspringMap.get(key)[1]);
    } else {
      System.out.println("No matching offspring found for the given parents.");
    }
  }
}
