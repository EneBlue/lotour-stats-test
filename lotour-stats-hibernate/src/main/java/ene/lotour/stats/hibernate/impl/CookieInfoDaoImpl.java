package ene.lotour.stats.hibernate.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import ene.lotour.stats.hibernate.CookieInfoDao;
import ene.lotour.stats.hibernate.pojo.CookieInfo;

@Repository("CookieInfoDao")
public class CookieInfoDaoImpl extends BasicDaoImpl<CookieInfo> 
		implements CookieInfoDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<CookieInfo> getUserDataList() {
		String hql = "from CookieInfo";
		Session session = this.getSession();
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(100);
		List<CookieInfo> list = query.list();
		session.close();
		return list;
	}

	@Override
	public List<CookieInfo> getUserData(String cookieId) {
		String hql = "from CookieInfo where cookieId = '" + cookieId + "'";
		return this.list(hql);
	}

	@Override
	public List<CookieInfo> getUserData(String currentUrl, String dateSeq) {
		String hql = "from CookieInfo where currentUrl = '" + currentUrl + "' and dateSeq = '" + dateSeq + "'";
		return this.list(hql);
	}
	
	
}
