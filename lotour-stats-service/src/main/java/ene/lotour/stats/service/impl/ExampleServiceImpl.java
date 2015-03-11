package ene.lotour.stats.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ene.lotour.stats.hibernate.ExampleDao;
import ene.lotour.stats.service.ExampleService;

@Service("EampleService")
public class ExampleServiceImpl implements ExampleService{

	@Resource
	private ExampleDao exampleDao;
	
	@Override
	public void doSomething() {
		exampleDao.doSomething();
	}

}
