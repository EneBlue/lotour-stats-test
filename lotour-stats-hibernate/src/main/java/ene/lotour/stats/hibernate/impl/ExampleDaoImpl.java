package ene.lotour.stats.hibernate.impl;

import org.springframework.stereotype.Repository;

import ene.lotour.stats.hibernate.ExampleDao;
import ene.lotour.stats.hibernate.pojo.ExamplePojo;

@Repository("ExampleDao")
public class ExampleDaoImpl extends BasicDaoImpl<ExamplePojo> implements ExampleDao{

	@Override
	public void doSomething() {
		//this.save(ExamplePojo o);
		System.out.println("It's a doSomethis() method!");
	}

}
