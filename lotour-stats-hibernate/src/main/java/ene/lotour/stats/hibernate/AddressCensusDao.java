package ene.lotour.stats.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import ene.lotour.stats.hibernate.pojo.AddressCensus;
@Repository
public interface AddressCensusDao {
	
	public List<AddressCensus> getAddressCensuses(String chName);
	
	public List<AddressCensus> getAddressCensuses();
	
}
