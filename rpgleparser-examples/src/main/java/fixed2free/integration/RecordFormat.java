package fixed2free.integration;

import java.util.ArrayList;
import java.util.List;

public class RecordFormat {
	private ArrayList<ColumnInfo> fields = new ArrayList<ColumnInfo>();
	private String name;
	private String recordFormatID;
	private String description;
	
	public ArrayList<ColumnInfo> getFields() {
		return fields;
	}
	public void setFields(List<ColumnInfo> list) {
		this.fields = (ArrayList<ColumnInfo>) list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRecordFormatID() {
		return recordFormatID;
	}
	public void setRecordFormatID(String recordFormatID) {
		this.recordFormatID = recordFormatID;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}

}
