import java.lang.Math;
interface Sqrt {
	double Sqrt(int num);
}
class sqrtimpl implements Sqrt{
	public double Sqrt(int num) {
		return Math.sqrt(num);
	}
}