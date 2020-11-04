import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTable {
    int tableLength = 10;
    List<Long>[] hashTable = (List<Long>[])new ArrayList[tableLength];

    public HashTable() {
        //Arrays.fill(hashTable, -1);
        for(int i = 0; i < hashTable.length; i++){
            hashTable[i] = new ArrayList<Long>();
        }

    }

    public void add(long phoneNumber) {
        int hash = hashPhoneNumber(phoneNumber);
        hashTable[hash].add(phoneNumber);
    }

    private int hashPhoneNumber(long phoneNumber) {
        return (int) (phoneNumber % tableLength);
    }

    public void print() {
        for (int i = 0; i < hashTable.length; i++) {
            List<Long> hashTableEntries = hashTable[i];
            System.out.println("Hash entry for index " + i);
            for(int j = 0; j < hashTableEntries.size(); j++){
                System.out.println(" " + hashTableEntries.get(j));
            }
        }
    }

	public boolean contains(long phoneNumber) {
		int hash = hashPhoneNumber(phoneNumber);
        return hashTable[hash].contains(phoneNumber);
	}

}
