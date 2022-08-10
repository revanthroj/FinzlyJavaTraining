package Volume;

import CommonVariable.Variable;

public class VolumeOperation {
	public int volume(int a) {
		Variable var = new Variable();
		var.setA(a);
		int volume = var.getA()*var.getA()*var.getA();
		System.out.println("7.Volume = " +volume);
		return volume;
	}
}
