package com.tv;

public class TVCR extends Tv implements IVCR {
	public static void main(String[] args) {
		TVCR tv = new TVCR();
		tv.play();
		tv.stop();
		tv.channelDown();
		System.out.println(tv.getCounter());
	}
	VCR vcr = new VCR();

	@Override
	public void play() {
		vcr.play();
	}

	@Override
	public void stop() {
		vcr.stop();
	}

	@Override
	public void reset() {
		vcr.reset();
	}

	@Override
	public int getCounter() {
		return vcr.getCounter();
	}

	@Override
	public void stCounter(int c) {
		vcr.setCounter(c);
	}
}
