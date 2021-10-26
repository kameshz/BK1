package com.org;

public class Desktop implements Hardware,Software {
	private void desktopModel() {
		System.out.println("Desktop Model");
	}

	@Override
	public void softwareResources() {
		System.out.println("Software Resources");
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources");
	}
	public static void main(String[] args) {
		Desktop p=new Desktop();
		p.desktopModel();
		p.softwareResources();
		p.hardwareResources();
		
	}
}
