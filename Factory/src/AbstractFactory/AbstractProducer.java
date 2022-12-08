package AbstractFactory;

public class AbstractProducer {
	public static AbstractFacotry getFacttory(String s) {
		if(s.equalsIgnoreCase("SanPham")) {
			return new SanPhamFactory();
		}else if(s.equalsIgnoreCase("NhaMay")) {
			return new NhaMayFactory();
		}
		return null;
	}
}
