package 실습;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ObjectDTO {
	private String OName;// 상품이름
	private int ea;// 수량
	private int buyea;
	private static int number = 100;// 품번
	private int cell;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
	private String Rdate;
	private String pno; //

	
	public int getBuyea() {
		return buyea;
	}

	public void setBuyea(int buyea) {
		this.buyea = buyea;
	}
	public ObjectDTO() {
		number++;
		this.pno = "P" + number;
		this.Rdate = DTF.format(LocalDateTime.now());
	}

	public String getOName() {
		return OName;
	}

	public void setOName(String oName) {
		OName = oName;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public static int getNumber() {
		return number;
	}

	public int getCell() {
		return cell;
	}

	public void setCell(int cell) {
		this.cell = cell;
	}

	
	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String toString() {
		return pno +"\t"+ OName+ "\t" + ea + "\t" + cell + "\t" + Rdate + " \n ";
	}
	public void print() {
		System.out.printf("%s\t%s\t%d\t%d\t%s\n",pno,OName,ea,cell,Rdate);
	}

}
