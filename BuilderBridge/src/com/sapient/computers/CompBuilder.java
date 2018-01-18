package com.sapient.computers;

import java.util.HashMap;
import java.util.Map;

import com.sapient.processors.I3;
import com.sapient.processors.I5;
import com.sapient.processors.IProcessor;

/*
 * Builder pattern assembling object based on the client request
 */
public class CompBuilder {

	private static Map<String,Computer>  cMap=new  HashMap<>();
	private static Map<String,IProcessor>  pMap=new  HashMap<>();
	
	static{
		pMap.put("i3", new I3());
		pMap.put("i5", new I5());
		cMap.put("laptop", new Laptop());
		cMap.put("desktop", new Desktop());
	}
	public static Computer getComputer(String comptype,String ptype) throws Exception{
		Computer comp=null;
		if(!cMap.containsKey(comptype) || !pMap.containsKey(ptype))
			throw new Exception("Invalid configuration");
		comp=cMap.get(comptype);
		comp.setProcessor(pMap.get(ptype));	
		return comp;
	}
	
}
