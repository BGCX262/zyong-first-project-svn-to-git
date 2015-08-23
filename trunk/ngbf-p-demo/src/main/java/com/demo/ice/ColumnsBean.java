package com.demo.ice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
@ManagedBean(name=ColumnsBean.BEAN_NAME)
public class ColumnsBean implements Serializable {

	protected static final String BEAN_NAME="columns";
	private int columnNum=3;
	private int rowNum=10;
	private List<String>rowData;
	private List<String>columnData;

	public ColumnsBean(){
		super();
		init();
	}
	
	//@PostConstruct
/**
 * 被@PostConstruct修饰的方法会在服务器加载Servle的时候运行，并且只会被服务器执行一次。
 * PostConstruct在构造函数之后执行,init()方法之前执行。
 * PreDestroy（）方法在destroy()方法执行执行之后执行
 */
	private void init(){
		  generateRows();
	      generateColumns();

	}

	private void generateRows(){
		rowData= generateData(getRowNum());
	}
	
	private void generateColumns(){
		columnData=generateData(getColumnNum());
		
	}
	private List<String>generateData(int count){
		List<String> toReturn = new ArrayList<String>();
		for(int i=0;i<count;i++){
			toReturn.add(String.valueOf(i));
		}
		return toReturn;
	}
	
	public void applyChanges(ActionEvent e){
		generateRows();
		generateColumns();
	}
	
	public int getColumnNum() {
		return columnNum;
	}

	public void setColumnNum(int columnNum) {
		this.columnNum = columnNum;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public List<String> getRowData() {
		return rowData;
	}

	public void setRowData(List<String> rowData) {
		this.rowData = rowData;
	}

	public List<String> getColumnData() {
		return columnData;
	}

	public void setColumnData(List<String> columnData) {
		this.columnData = columnData;
	}
	
}

