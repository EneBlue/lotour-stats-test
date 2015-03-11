package ene.lotour.stats.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ene.lotour.stats.hibernate.pojo.CookieInfo;

@Repository
public interface CookieInfoDao {
	
	public List<CookieInfo> getUserDataList();
	
	public List<CookieInfo> getUserData(String cookieId);
	
	public List<CookieInfo> getUserData(String currentUrl, String dateSeq);
	
}
