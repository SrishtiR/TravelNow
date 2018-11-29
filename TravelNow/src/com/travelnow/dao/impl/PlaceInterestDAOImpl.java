package com.travelnow.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.travelnow.dao_.PlaceInterestDao;
import com.travelnow.model.PlaceInterestModel;
import com.travelnow.model.UserModel;

@Repository("PlaceInterestDao")
public class PlaceInterestDAOImpl implements PlaceInterestDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Override
	public boolean addPlaceInterested(PlaceInterestModel placeIM) {
		int id = (Integer)hibernateTemplate.save(placeIM);
		if(id>0)
			return true;
		return false;
	}
	@SuppressWarnings("unchecked")
	@Override
	public PlaceInterestModel getPlaceInterested(int id) {
		// TODO Auto-generated method stub
		DetachedCriteria detachedCriteria =  DetachedCriteria.forClass(PlaceInterestModel.class);
		detachedCriteria.add(Restrictions.eq("personid", 1));
		List<PlaceInterestModel> findByCriteria = (List<PlaceInterestModel>) hibernateTemplate.findByCriteria(detachedCriteria);
		if(findByCriteria !=null && findByCriteria.size()>0)
			return findByCriteria.get(0);
		else
			return null;
	}
	
}
