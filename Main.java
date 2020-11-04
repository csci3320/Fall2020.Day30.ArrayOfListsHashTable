import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
  public static void main(String[] args) {
    new Main();
  }

 
  public Main() {
    // 1-123-456-7890
    // 1,234,567,890
    /// int[] array = new int[1_234_567_890];
    // System.out.println(array.length);
    HashTable hashTable = new HashTable();
    
    long[] phoneNumbers = { 402_554_1234L, 402_554_9999L, 402_554_4444L, };
    for (int i = 0; i < phoneNumbers.length; i++) {
      long phoneNumber = phoneNumbers[i];
      hashTable.add(phoneNumber);
    }

    // Print hash table
    hashTable.print();

    System.out.println(hashTable.contains(402_554_1234L));
    System.out.println(hashTable.contains(402_554_5555L));
  }

  
}
