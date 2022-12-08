package AbstractFactory;

import nhamay.NhaMay;
import sanpham.SanPham;

public abstract class AbstractFacotry {
	public abstract SanPham getSanPham(String s);
	public abstract NhaMay getNhaMay(String s);
}
