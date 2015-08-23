package com.demo.primefaces;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
@ManagedBean(name = "cityBean")
@SessionScoped
public class CityBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1356995449236995401L;
	private String city;
	private String suburb;
	private Map<String, String> cities = new HashMap<String, String>();
	private Map<String, Map<String, String>> suburbsData = new HashMap<String, Map<String, String>>();
	private Map<String, String> suburbs = new HashMap<String, String>();

	public CityBean() {
		cities.put("山东", "sd");
		cities.put("河南", "hn");
		cities.put("上海", "sh");

		Map<String, String> suburbsSd = new HashMap<String, String>();
		suburbsSd.put("济宁", "jining");
		suburbsSd.put("济南", "jinan");
		suburbsSd.put("青岛", "qingdao");

		Map<String, String> suburbsSh = new HashMap<String, String>();
		suburbsSh.put("黄浦", "huangpu");
		suburbsSh.put("浦东", "pudong");
		suburbsSh.put("闵行", "minhang");

		Map<String, String> suburbsHn = new HashMap<String, String>();
		suburbsHn.put("郑州", "zhengzhou");
		suburbsHn.put("商丘", "shangqiu");
		suburbsHn.put("驻马店", "zhumadian");

		suburbsData.put("sd", suburbsSd);
		suburbsData.put("sh", suburbsSh);
		suburbsData.put("hn", suburbsHn);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public Map<String, String> getCities() {
		return cities;
	}

	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}

	public Map<String, Map<String, String>> getSuburbsData() {
		return suburbsData;
	}

	public void setSuburbsData(Map<String, Map<String, String>> suburbsData) {
		this.suburbsData = suburbsData;
	}

	public Map<String, String> getSuburbs() {
		return suburbs;
	}

	public void setSuburbs(Map<String, String> suburbs) {
		this.suburbs = suburbs;
	}

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void handleCityChange() {
		System.out.println(city);
		System.out.println("-----------------");

		if (city != null && !city.equals("")) {
			System.out.print(1);

			suburbs = suburbsData.get(city);
			System.out.print(1);
			System.out.print(2);
			System.out.print(3);
		} else {
			suburbs = new HashMap<String, String>();
		}

	}

	public void displayLocation() {
		System.out.println("-----------------");
		System.out.println(city + "---" + suburb);
		FacesMessage msg = new FacesMessage("Selected", "City:" + city
				+ ", Suburb:" + suburb);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void save(ActionEvent actionEvent) {
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null,
				new FacesMessage("Successful", "Hello " + text));
		context.addMessage(null, new FacesMessage("Second Message",
				"Additional Info Here..."));
	}



		private int count;

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
		
		public void increment() {
			count++;
		}
}
