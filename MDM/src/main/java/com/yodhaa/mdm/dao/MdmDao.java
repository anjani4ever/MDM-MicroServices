package com.yodhaa.mdm.dao;

import java.io.Serializable;

public interface MdmDao<T> {
	
	void insertDocumnet(T saveDocumnet);
	void updateDocumnet(T updateDocumnet);
	void deleteDocumnet(T removeDocumnet);
	Object getDocumnet(T getDocumnet,Class<Serializable> entity);
	Object QueryDocumnet(String query,Class<Serializable> entity);

}
