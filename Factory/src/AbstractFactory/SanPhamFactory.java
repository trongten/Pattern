package AbstractFactory;

import nhamay.NhaMay;
import sanpham.Dep;
import sanpham.Giay;
import sanpham.SanPham;

public class SanPhamFactory extends AbstractFacotry{

	@Override
	public SanPham getSanPham(String s) {
		if(s.equalsIgnoreCase("Giay")) {
			return new Giay();
		}else if(s.equalsIgnoreCase("Dep")) {
			return new Dep();
		}
		return null;
	}

	@Override
	public NhaMay getNhaMay(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
