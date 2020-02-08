package abc;

public class MyBag implements BagInterface {

	final int MAX = 5;  // hold at most 50 items
	int bagSize = 0;  // total number of items in the bag
	
	Coin[] Bank = new Coin[MAX];
	
	@Override
	public int getCurrentSize() {
		return bagSize;
	}

	@Override
	public boolean isEmpty() {
		return bagSize == 0;
	}

	@Override
	public boolean add(Coin newEntry) {
		boolean rc = false;
		
		if (bagSize < MAX) {
			Bank[bagSize] = newEntry;
			bagSize++;
			rc =  true;
		}
		return rc;
	}

	@Override
	public Coin remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Coin anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		bagSize = 0; 
	}

	@Override
	public int getFrequencyOf(Coin anEntry) {
		int count=0;
		
		for(int x=0; x<Bank.size(); x++) {
			if(Bank.get(x).equals(anEntry))
				count++;
		}
		
		return count;
	}

	@Override
	public boolean contains(Coin anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Coin[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

}
