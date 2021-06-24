public class PrepaidCard extends Ticket {

	public PrepaidCard(int value) {
		super(value);
	}

	@Override
	public void adjustValue(int amount) {
		deduct(amount);
	}

	@Override
	public boolean isValid() {
		return getValue() > 0;
	}
}
