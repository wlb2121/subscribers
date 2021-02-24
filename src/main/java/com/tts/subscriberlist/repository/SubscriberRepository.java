package com.tts.subscriberlist.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.subscriberlist.model.Subscriber;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

}
