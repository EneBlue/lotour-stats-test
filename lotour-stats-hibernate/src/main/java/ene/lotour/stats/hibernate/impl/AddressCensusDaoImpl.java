package ene.lotour.stats.hibernate.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ene.lotour.stats.hibernate.AddressCensusDao;
import ene.lotour.stats.hibernate.pojo.AddressCensus;


@Repository("AddressCensusDao")
public class AddressCensusDaoImpl extends BasicDaoImpl<AddressCensus> 
		implements AddressCensusDao{

	@Override
	public List<AddressCensus> getAddressCensuses(String chName) {
		String hql = "from AddressCensus where chName = '" +chName+ "'";
		return this.list(hql);
	}

	@Override
	public List<AddressCensus> getAddressCensuses() {
		String hql = "from AddressCensus ";
		return this.list(hql);
	}

}
