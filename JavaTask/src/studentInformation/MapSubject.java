package studentInformation;

import java.util.Set;


public class MapSubject {
	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + ", st=" + st + "]";
	}
	private int subId;
	private String subName;
	public int getSubId() {
		return subId;
	}
	public String getSubName() {
		return subName;
	}
	public Set<MapStudent> getSt() {
		return st;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public void setSt(Set<MapStudent> st) {
		this.st = st;
	}
	private Set<MapStudent> st;

}
