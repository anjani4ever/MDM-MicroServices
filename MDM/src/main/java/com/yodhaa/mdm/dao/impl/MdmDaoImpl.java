package com.yodhaa.mdm.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.yodhaa.mdm.dao.MdmDao;

@SuppressWarnings({"rawtypes","unchecked"})
@Repository
public class MdmDaoImpl implements MdmDao{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void insertDocumnet(Object saveDocumnet) {
		 mongoTemplate.insert(saveDocumnet);
	}

	@Override
	public void deleteDocumnet(Object removeDocumnet) {
		mongoTemplate.remove(removeDocumnet);
	 }

	//TODO need to map to multiple inputs.
	@Override
	public Object QueryDocumnet(String query,Class entity) {
		return	mongoTemplate.find(Query.query(new Criteria()
                        .orOperator(Criteria.where("description").regex(query, "i"),
                                    Criteria.where("make").regex(query, "i"),
                                    Criteria.where("model").regex(query, "i"))
                        ), entity);
	}

	@Override
	public Object getDocumnet(Object getDocumnet,  Class entity) {
		return mongoTemplate.findById(getDocumnet,entity);
	}

	@Override
	public void updateDocumnet(Object updateDocumnet) {
		//mongoTemplate.updateFirst(query, update, entityClass);
	}


}
