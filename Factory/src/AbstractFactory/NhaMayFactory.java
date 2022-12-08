package AbstractFactory;

import nhamay.Anh;
import nhamay.My;
import nhamay.NhaMay;
import sanpham.SanPham;

public class NhaMayFactory extends AbstractFacotry{

	@Override
	public SanPham getSanPham(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NhaMay getNhaMay(String s) {
		if(s.equalsIgnoreCase("Anh")) {
			return new Anh();
		}else if(s.equalsIgnoreCase("My")) {
			return new My();
		}
		return null;
	}

}
