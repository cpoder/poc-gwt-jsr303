package com.octo.poc.gwt.validation.server.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Size;

public class SomeDomainClass {
	private Long id;

	@Size(min = 3, max = 10)
	private String someString;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSomeString() {
		return someString;
	}

	public void setSomeString(String someString) {
		this.someString = someString;
	}

	private static Map<Long, SomeDomainClass> all = new HashMap<Long, SomeDomainClass>();
	static {
		SomeDomainClass sdc = new SomeDomainClass();
		sdc.setId(1L);
		sdc.setSomeString("coucou");
		sdc.persist();
		sdc = new SomeDomainClass();
		sdc.setId(2L);
		sdc.setSomeString("Hello");
		sdc.persist();
	}

	public static int countSomeDomainClasses() {
		return all.size();
	}

	public static List<SomeDomainClass> getAll() {
		return new ArrayList<SomeDomainClass>(all.values());
	}

	public void persist() {
		all.put(id, this);
	}

	public void remove() {
		all.remove(this);
	}

	public static SomeDomainClass findSomeDomainClass(Long id) {
		return all.get(id);
	}

	public static Integer getVersion() {
		return 1;
	}
}
