package com.ey

import com.redis._
import org.slf4j.LoggerFactory


object Lists extends App {

	val logger = LoggerFactory.getLogger(Lists.getClass())
	logger.info(s"to start redis run in console `docker run --name some-redis -d -p $redisPort:$redisPort redis`")

	
	val redisPort = 6379
	val r = new RedisClient("localhost", redisPort)  

	val listName = "list"
	r.lpush(listName, "foo")
	r.lpush(listName, "bar")
	r.llen(listName).map( found => logger.info(s"found list with length $found"))
}