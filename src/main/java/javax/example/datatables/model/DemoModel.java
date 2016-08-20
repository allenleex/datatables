package javax.example.datatables.model;

import java.util.List;

public class DemoModel {

	private int draw;
	private int recordsTotal;
	private int recordsFiltered;
	private List<List<String>> data;
	
	public int getDraw() {
		return draw;
	}
	
	public void setDraw(int draw) {
		this.draw = draw;
	}
	
	public int getRecordsTotal() {
		return recordsTotal;
	}
	
	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	
	public int getRecordsFiltered() {
		return recordsFiltered;
	}
	
	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public List<List<String>> getData() {
		return data;
	}

	public void setData(List<List<String>> data) {
		this.data = data;
	}

}
