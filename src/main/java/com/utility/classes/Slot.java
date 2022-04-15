package com.utility.classes;

import java.util.Objects;

public class Slot {
    
	private int no, slotno,totalfloor;
	
	public Slot(int no, int slotno, int totalfloor) {
		super();
		this.no = no;
		this.slotno = slotno;
		this.totalfloor = totalfloor;
	}
	
	public Slot() {
		super();
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getSlotno() {
		return slotno;
	}
	public void setSlotno(int slotno) {
		this.slotno = slotno;
	}
	public int getTotalfloor() {
		return totalfloor;
	}
	public void setTotalfloor(int totalfloor) {
		this.totalfloor = totalfloor;
	}

	@Override
	public String toString() {
		return "Slot [no=" + no + ", slotno=" + slotno + ", totalfloor=" + totalfloor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(no, slotno, totalfloor);
	}
}
