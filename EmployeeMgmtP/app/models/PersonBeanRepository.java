package models;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

import com.google.inject.ImplementedBy;

import play.mvc.Result;

/**
 * This interface provides a non-blocking API for possibly blocking operations.
 */
@ImplementedBy(JPAPersonBeanRepository.class)
public interface PersonBeanRepository {

    CompletionStage<PersonBean> add(PersonBean person);

    CompletionStage<Stream<PersonBean>> list();

	CompletionStage<PersonBean> delete(PersonBean person);



	CompletionStage<PersonBean> update(PersonBean person, String string);

	CompletionStage<Boolean> verify(PersonBean person);

	CompletionStage<PersonBean> showData(PersonBean person);

	CompletionStage<PersonBean> deleteData(PersonBean person);

	CompletionStage<ContactBean> addContact(ContactBean person);

	

	


}
