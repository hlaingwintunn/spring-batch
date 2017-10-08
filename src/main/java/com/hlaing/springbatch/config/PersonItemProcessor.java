package com.hlaing.springbatch.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.hlaing.springbatch.model.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {
	private static final Logger logger = LoggerFactory.getLogger(PersonItemProcessor.class);

	@Override
	public Person process(final Person person) throws Exception {
		final String firstname = person.getFirstname().toUpperCase();
		final String lastname = person.getLastname().toUpperCase();
		
		final Person personTransform = new Person(firstname, lastname);
		
		logger.info("converting {} into {}", person, personTransform);
		
		return personTransform;
	}


}
