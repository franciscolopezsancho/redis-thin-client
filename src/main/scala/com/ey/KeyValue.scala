package com.ey

import com.redis._
import org.slf4j.LoggerFactory


object KeyValue extends App {

	val logger = LoggerFactory.getLogger(KeyValue.getClass())
	logger.info(s"to start redis run in console `docker run --name some-redis -d -p $redisPort:$redisPort redis`")

	
	val redisPort = 6379
	val r = new RedisClient("localhost", redisPort)  
	
	val key,value = ("key1","value1")
	r.set(key, value)
	r.get(key).map( found => logger.info(s"found key-value $found"))

	val key2,value2 = (1,true)
	r.set(key2, value2)
	r.get(key2).map( found => logger.info(s"found key-value $found"))
}