public abstract class Ticket {
	private Gate origin;
	private int value;

	public Ticket(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void deduct(int amount) {
		value -= amount;
	}

	public void setOrigin(Gate origin) {
		this.origin = origin;
	}

	public Gate getOrigin() {
		return origin;
	}

	public abstract void adjustValue(int amount);
	public abstract boolean isValid();
}
