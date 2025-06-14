package practicce;

class Shop{
	Lock lock = new Lock();
	
	public void shopStatus() {
		if(lock.isLocking()) {
			System.out.println("Shop is closed");
		} else {
			System.out.println("Shop is open");
		}
	}
	
	
	public Lock getLock() {
		return lock;
	}


	public void setLock(Lock lock) {
		this.lock = lock;
	}


	class Lock{
		private boolean locking = true;

		public boolean isLocking() {
			return locking;
		}

		public void setLocking(boolean locking) {
			this.locking = locking;
		}
	}
}

public class Inner_class_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.shopStatus();
		shop.getLock().setLocking(false);
	}

}
