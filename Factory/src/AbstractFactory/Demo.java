package AbstractFactory;

import nhamay.NhaMay;
import sanpham.SanPham;

public class Demo {

	public static void main(String[] args) {
		
		NhaMay b1 = AbstractProducer.getFacttory("NhaMay").getNhaMay("Anh");
		SanPham b2 = AbstractProducer.getFacttory("SanPham").getSanPham("Giay");
		b2.getInfo();
		b1.getInfo();		
	}
}
