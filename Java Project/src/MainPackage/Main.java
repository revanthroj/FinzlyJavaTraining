package MainPackage;
import Addition.AddOperation;
import Subtraction.SubOperation;
import Multiplication.MultiplyOperation;
import Division.Divide;
import Remainder.RemainderOpreration;
import Circle_square.Circle_square_Operation;
import Volume.VolumeOperation;
import Equal.Equal_operation;
import GreaterThan.GreaterThan_Operation;
import IsPositive.IsPositive_operator;


public class Main {

	public static void main(String[] args) {
		AddOperation Plus = new AddOperation();
		Plus.add(1,4);
		SubOperation Minus = new SubOperation();
		Minus.sub(3,2);
		MultiplyOperation Multiply = new MultiplyOperation();
		Multiply.multiply(2, 5);
		Divide divide = new Divide();
		divide.div(10, 5);
		RemainderOpreration rem = new RemainderOpreration();
		rem.remainder(12,9);
		Circle_square_Operation cir_sqr = new Circle_square_Operation();
		cir_sqr.circle_square(4);
		VolumeOperation vol = new VolumeOperation();
		vol.volume(12);
		Equal_operation equ = new Equal_operation();
		equ.equal(3, 3);
		GreaterThan_Operation Greater = new GreaterThan_Operation();
		Greater.greater(54, 50);
		IsPositive_operator positive = new IsPositive_operator();
		positive.Positive(6);
	}

}
