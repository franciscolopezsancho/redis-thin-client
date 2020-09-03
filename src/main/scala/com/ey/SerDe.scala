package com.ey

import com.redis._
import org.slf4j.LoggerFactory
import serialization._
import Parse.Implicits._


object SerDe extends App {

	val logger = LoggerFactory.getLogger(SerDe.getClass())
	logger.info(s"to start redis run in console `docker run --name some-redis -d -p $redisPort:$redisPort redis`")

	val redisPort = 6379
	val r = new RedisClient("localhost", redisPort)  

	r.hmset("hash", Map("field1" -> "1", "field2" -> 2))
	r.hmget[String,String]("hash", "field1", "field2")
		.map( found => logger.info(s"found map $found"))
}