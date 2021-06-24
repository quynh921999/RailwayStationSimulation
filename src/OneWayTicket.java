public class OneWayTicket extends Ticket {
	private boolean valid = true;
	public OneWayTicket(int value) {
		super(value);
	}
	public void setOrigin(Gate gate) {
		super.setOrigin(gate);
		if (gate == null)
			valid = false;
	}
	@Override
	public void adjustValue(int amount) {

	}

	@Override
	public boolean isValid() {
		return valid;
	}
}
