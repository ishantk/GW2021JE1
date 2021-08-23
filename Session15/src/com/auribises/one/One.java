package com.auribises.one;

// public class
public class One {
	
	private void showPvt() {
		System.out.println("This is in private show of One");
	}
	
	void showDef() {
		System.out.println("This is in default show of One");
	}
	
	protected void showProt() {
		System.out.println("This is in protected show of One");
	}
	
	public void showPub() {
		System.out.println("This is in public show of One");
	}
	

}

/*public class OneAgain{
	
}*/

// default class or package class
class Two{
	
	private void showPvt() {
		System.out.println("This is in private show of Two");
	}
	
	void showDef() {
		System.out.println("This is in default show of Two");
	}
	
	protected void showProt() {
		System.out.println("This is in protected show of Two");
	}
	
	public void showPub() {
		System.out.println("This is in public show of Two");
	}
	
}

// private and protected class not allowed on top level
/*private class Three{
	
}

protected class Four{
	
}*/
