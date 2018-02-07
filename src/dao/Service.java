package dao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import util.*;

public class Service {
	
	public void addProduit(Produit p){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		//session.persist(p);
		session.getTransaction().commit();
	}
	
	public void deleteProduit(Produit p){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(p);
		session.getTransaction().commit();

	}
	
	public Produit getProduit(Integer idP){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p=(Produit) session.load(Produit.class, idP);
		return p;	
	}
	
	
	public List<Produit> getAllProduit(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();	
		return session.createQuery("from Produit").list();	
	}
	public List<Produit> getbykey(String key){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//session.beginTransaction();
		Criteria cr=session.createCriteria(Produit.class);
		cr.add(Restrictions.like("nom", "%"+key+"%"));
		List<Produit> l=cr.list();
		return l;
	}
	public List<Produit> getbykeys(String key1,float key2,float key3){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//session.beginTransaction();
		Criteria cr=session.createCriteria(Produit.class);
		cr.add(Restrictions.like("nom", "%"+key1+"%"));
		cr.add(Restrictions.between("prix",key2,key3));
		List<Produit> l=cr.list();
		return l;
	}

}
