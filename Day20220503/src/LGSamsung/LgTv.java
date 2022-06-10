package LGSamsung;

public class LgTv implements TV{
	@Override
	public void powerOn() {
		System.out.println("lg......on");
	}

	@Override
	public void powerOff() {
		System.out.println("lg......off");
	}

	@Override
	public void volumeUp() {
		System.out.println("lg......up");
	}

	@Override
	public void volumeDown() {
		System.out.println("lg......down");
	}
}
