package LGSamsung;

public class SamsungTv implements TV{

	@Override
	public void powerOn() {
		System.out.println("sam......on");
	}

	@Override
	public void powerOff() {
		System.out.println("sam......off");
	}

	@Override
	public void volumeUp() {
		System.out.println("sam......up");
	}

	@Override
	public void volumeDown() {
		System.out.println("sam......down");
	}

}
